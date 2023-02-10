<script>
import { useVuelidate } from '@vuelidate/core'
import { required } from '@vuelidate/validators'
export default {
    setup() {
        return {
            validator: useVuelidate()
        }
    },

    data() {
        return {
            inputs: {
                emailOrIdentifier: null,
                password: null
            }
        }
    },

    validations() {
        return {
            inputs: {
                emailOrIdentifier: { required },
                password: { required }
            }
        }
    },

    methods: {
        async signIn() {
            const valid = await this.validator.$validate();
            if (valid) {
                const response = await this.$axios.post('/user-accounts/sign-in', this.inputs);
                console.log(response.status);
                if (response.status == 204) {
                    alert(response.data);
                } else {
                    console.log("Server Error");
                }
            }
        }
    }
}
</script>

<template>
    <form id="sign-in" @submit.prevent="signIn">
        <div class="mb-3">
            <label for="identifier" class="form-label required">Internal identifier or email</label>
            <input type="text" name="identifier" class="form-control" id="identifier"
                v-model="inputs.emailOrIdentifier">
        </div>
        <div class="mb-3">
            <label for="passwordSignIn" class="form-label required">Password</label>
            <input type="password" name="passwordSignIn" class="form-control" id="passwordSignIn"
                v-model="inputs.password">
        </div>
        <button type="submit" class="btn btn-outline-dark col-12 col-md-3 btn-wrap">Sign in</button>
    </form>
</template>
<style scoped>

</style>