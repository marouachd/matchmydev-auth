<script>
import { useVuelidate } from '@vuelidate/core'
import { required, helpers } from '@vuelidate/validators'

const identifierValidator = helpers.regex(/[A-Z]{2,7}[0-9]{6}/);
const emailValidator = helpers.regex(/[a-zA-Z]+.[a-zA-Z]+@[a-z]+.[a-z]{2,4}$/);
const passwordValidator = helpers.regex(/(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[%||!||*]).{8,42}/);

export default {
    setup() {
        const validator = useVuelidate();
        return {
            validator
        }
    },
    data() {
        return {
            inputs: {
                internalIdentifier: "FMARSHA010670",
                internalEmail: "first.last@domain.com",
                password: "Garfield2022!"
            }
        }
    },
    validations() {
        return {
            inputs: {
                internalIdentifier: { required, identifierValidator: helpers.withMessage("Should respect SG pattern", identifierValidator) },
                internalEmail: { required, emailValidator: helpers.withMessage("Should be a valid email", emailValidator) },
                password: { required, passwordValidator: helpers.withMessage("length [8, 42] + at least 1 upper and lower letter, at least 1 digit, at least 1 of %*!", passwordValidator) }
            }
        }
    },
    methods: {
        async submitForm() {
            const valid = await this.validator.$validate();
            if (valid) {
                const response = await this.$axios.post('useraccount', this.inputs);
                if (response) {
                    document.location.href = "/sign-in";
                }
            }
        }
    }
}
</script>

<template>
    <form id="signUp" @submit.prevent="submitForm">
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
        <div class="mb-3">
            <label for="password" class="form-label required">Password</label>
            <input type="password" name="password" class="form-control" id="password" v-model="inputs.password"
                :class="{ 'is-invalid': validator.inputs.password.$error }">
            <div class="form-text">e.g. Garfield2022!</div>
            <span v-if="validator.inputs.password.$error">
                {{ validator.inputs.password.$errors[0].$message }}
            </span>
        </div>
        <button type="submit" class="btn btn-outline-dark col-12 col-md-3">Sign up</button>
    </form>
</template>
<style scoped>
.btn-outline-dark {
    background-color: var(--main-grey-color);
    border-color: var(--main-grey-color);
    float: right;

    color: var(--main-dark-color);
    letter-spacing: 0.05rem;
}

.btn-outline-dark:hover {
    background-color: var(--second-grey-color);
    box-shadow: 0px 0px 5px 4px var(--second-grey-color);
    color: var(--main-dark-color);
}

.btn-outline-dark:focus {
    background-color: var(--second-grey-color);
    box-shadow: 0px 0px 5px 4px var(--second-grey-color) !important;
    color: var(--main-dark-color);
}

.btn-wrap {
    min-width: 120px;
}



.required::after {
    color: var(--main-red-color);
    font-weight: bold;
    content: " *";
}

.form-control:focus {
    border: none;
    box-shadow: 0px 0px 5px 4px var(--second-grey-color);
}



.form-label {
    font-weight: 600;
}
</style>