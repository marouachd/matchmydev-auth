<script>
import { useVuelidate } from '@vuelidate/core'
import { required } from '@vuelidate/validators'

export default {
    data() {
        return {
            inputs: {
                emailOrIdentifier: null,
                password: null
            }
        }
    },

    validations() {
        inputs: {
            emailOrIdentifier: { required }
            password: { required }
        }
    },

    methods: {
        async submitForm() {
            const test = await this.$axios.get('user-accounts');
            if (test) {
                console.log("yeah");
            }
        }
    }
}
</script>

<template>
    <form id="sign-in" @submit.prevent="submitForm">
        <div class="mb-3">
            <label for="identifier" class="form-label required">Internal identifier or email</label>
            <input type="email" name="identifier" class="form-control" id="identifier" v-model="emailOrIdentifier">
        </div>
        <div class="mb-3">
            <label for="passwordSignIn" class="form-label required">Password</label>
            <input type="password" name="passwordSignIn" class="form-control" id="passwordSignIn" v-model="password">
        </div>
        <button type="submit" class="btn btn-outline-dark col-12 col-md-3 btn-wrap">Sign in</button>
    </form>
</template>
<style scoped>

</style>