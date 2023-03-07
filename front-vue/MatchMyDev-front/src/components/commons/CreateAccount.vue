<script>
import { useVuelidate } from '@vuelidate/core'
import { required, helpers } from '@vuelidate/validators'

const identifierValidator = helpers.regex(/[A-Z]{2,7}[0-9]{6}/);
const emailValidator = helpers.regex(/[A-Za-z]+\.[A-Za-z]+@[A-Za-z]+\.[A-Za-z]{2,4}$/);
const passwordValidator = helpers.regex(/(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[%||!||*])(?!.* ).{8,42}/);

export default {
    setup() {
        return {
            validator: useVuelidate()
        }
    },
    data() {
        return {
            inputs: {
                // set Null when finish
                internalIdentifier: "FMARSHA010670",
                internalEmail: "first.last@domain.com",
                password: "Garfield2022!",
                role: ""
            }
        }
    },
    validations() {
        return {
            inputs: {
                internalIdentifier: { required, identifierValidator: helpers.withMessage("Should respect SG pattern", identifierValidator) },
                internalEmail: { required, emailValidator: helpers.withMessage("Should be a valid email", emailValidator) },
                password: { required, passwordValidator: helpers.withMessage("length [8, 42] + at least 1 upper and lower letter, at least 1 digit, at least 1 of %*!", passwordValidator) },
                role: { required }
            }
        }
    },
    methods: {
        async submit() {
            const valid = await this.validator.$validate();
            if (valid) {
                const response = await this.$axios.post('/user-accounts/create-account', this.inputs);
                console.log(response.status);
                if (response.status == 204) {
                    this.$router.push('sign-in');
                } else {
                    console.log("Server Error");
                }
            }
        }
    }
}
</script>
<template>
    <div class="container-xl my-5 pt-5">
        <h1>Create account</h1>
        <form id="sign-up" @submit.prevent="submit">
            <div class="row my-5">

                <div class="col-md mx-auto">

                    <div class="mb-3">
                        <label for="internalIdentifier" class="form-label required ">Internal identifier</label>
                        <input class="form-control" name="internalIdentifier" id="internalIdentifier"
                            v-model="inputs.internalIdentifier"
                            :class="{ 'is-invalid': validator.inputs.internalIdentifier.$error }">
                        <div class=" form-text">e.g. FMARSHA010406</div>
                        <span v-if="validator.inputs.internalIdentifier.$error">
                            {{ validator.inputs.internalIdentifier.$errors[0].$message }}
                        </span>
                    </div>
                    <div class="mb-3">
                        <label for="internalEmail" class="form-label required">Internal email</label>
                        <input type="email" name="internalEmail" class="form-control" id="internalEmail"
                            v-model="inputs.internalEmail" :class="{ 'is-invalid': validator.inputs.internalEmail.$error }">
                        <div class="form-text">e.g. first.last@domain.com</div>
                        <span v-if="validator.inputs.internalEmail.$error">
                            {{ validator.inputs.internalEmail.$errors[0].$message }}
                        </span>
                    </div>

                </div>
                <div class="col-md  mx-auto">

                    <div class="mb-3">
                        <label for="password" class="form-label required">Password</label>
                        <input type="password" name="password" class="form-control" id="password" v-model="inputs.password"
                            :class="{ 'is-invalid': validator.inputs.password.$error }">
                        <div class="form-text">e.g. Garfield2022!</div>
                        <span v-if="validator.inputs.password.$error">
                            {{ validator.inputs.password.$errors[0].$message }}
                        </span>
                    </div>
                    <div class="mb-3">
                        <label for="userRole" class="form-label required">Role</label>
                        <select v-model="role" class="form-select" aria-label="Default select example"
                            :class="{ 'is-invalid': validator.inputs.role.$error }">
                            <option disabled value="">Choose a role</option>
                            <option value="1">ROLE_DEV</option>
                            <option value="2">ROLE_TECH_LEAD</option>
                            <option value="3">ROLE_MANAGER</option>
                        </select>

                    </div>

                    <button type="submit" class="btn btn-outline-dark col-12 col-md-3">Create Account</button>
                </div>


            </div>
        </form>
    </div>
</template>
<style></style>