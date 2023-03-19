<script>
import { useRoute } from 'vue-router';
import { useVuelidate } from '@vuelidate/core'
import { minValue, helpers } from '@vuelidate/validators'

const passwordValidator = helpers.regex(/(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[%||!||*])(?!.* ).{8,42}/);

export default {
    setup() {
        return {
            route: useRoute(),
            validator: useVuelidate()
        }
    },

    data() {
        return {
            id: this.route.params.id,
            roles: [],
            infos: [],
            inputs: {
                password: null,
                roleId: 0
            }
        }
    },
    validations() {
        return {
            inputs: {
                password: { passwordValidator: helpers.withMessage("length [8, 42] + at least 1 upper and lower letter, at least 1 digit, at least 1 of %*!", passwordValidator) },
                roleId: { minValue: minValue(1) }
            }
        }
    },

    methods: {
        async submit() {
            const valid = await this.validator.$validate();
            if (valid) {
                const response = await this.$axios.patch(`admin/account-user/${this.id}/update`, this.inputs);
                if (response.status == 204) {
                    this.$router.push({ name: 'admin' });
                } else {
                    console.log("Server error")
                }
            }
        },
        async initRole() {
            const resp = await this.$axios.get('/roles');
            this.roles = resp.data;
        },
        async initInfo() {
            const resp = await this.$axios.get(`/admin/${this.id}/for-update`);
            this.infos = resp.data;
            this.inputs.roleId = resp.data.roleId;
        }
    },

    beforeMount() {
        this.initRole();
        this.initInfo();
    }
}
</script>

<template>
    <div class="container-xl my-5 pt-5">
        <h1>Edit user account</h1>
        <div class="row my-5 mx-auto">
            <div class="col-md mx-auto">
                <label class="form-label">Internal identifier</label>
                <p>{{ this.infos.internalIdentifier }}</p>
            </div>
            <div class="col-md mx-auto">
                <label class="form-label">Internal email</label>
                <p>{{ this.infos.internalEmail }}</p>
            </div>
        </div>
        <form id="edit-account" @submit.prevent="submit">
            <div class="row my-5 mx-auto">
                <div class="col-md mx-auto">

                    <div class="mb-3">
                        <label for="passwordEditAccount" class="form-label">Password</label>
                        <input type="password" name="passwordEditAccount" id="passwordEditAccount" v-model="inputs.password"
                            class="form-control" :class="{ 'is-invalid': validator.inputs.password.$error }">
                        <div class="form-text">e.g. Garfield2022!</div>
                        <span v-if="validator.inputs.password.$error">
                            {{ validator.inputs.password.$errors[0].$message }}
                        </span>
                    </div>
                </div>
                <div class="col-md  mx-auto">
                    <div class="mb-3">
                        <label for="roleAccountEdit" class="form-label required ">Role</label>
                        <select v-model.number="inputs.roleId" id="roleId" name="roleId" class="form-select"
                            :class="{ 'is-invalid': validator.inputs.roleId.$error }">
                            <option selected disabled value="0">Choose a role</option>
                            <option v-for="role in roles" :value="role.id">
                                {{ role.name }}
                            </option>
                        </select>
                    </div>
                    <button type="submit" class="btn btn-outline-dark col-12 col-md-3">Save</button>
                </div>
            </div>
        </form>
    </div>
</template>