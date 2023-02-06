<script>
import axios from 'axios';
import { useVuelidate } from '@vuelidate/core'
import { required, maxLength, maxValue, minValue, url } from '@vuelidate/validators'

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
    methods: {
        submitForm() {
            axios.get('http://localhost:8080/useraccount').then(function (response) {
                // const header = response.headers;
                // return await response.json();
                console.log("YEAH");
            }).catch(function (error) {
                console.log(error);
            });
        }
    }
}
</script>

<template>
    <form id="signIn" @submit.prevent="submitForm">
        <div class="mb-3">
            <label for="identifier" class="form-label required">${Messages.messages.signIn.formIdentifier}</label>
            <input type="email" name="identifier" class="form-control" id="identifier">
        </div>
        <div class="mb-3">
            <label for="passwordSignIn" class="form-label required">${Messages.messages.signIn.formPassword}</label>
            <input type="password" name="passwordSignIn" class="form-control" id="passwordSignIn">
        </div>
        <button type="submit"
            class="btn btn-outline-dark col-12 col-md-3 btn-wrap">${Messages.messages.signIn.submit}</button>
    </form>
</template>