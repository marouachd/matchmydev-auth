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
                internalIdentifier: { required, identifierValidator },
                internalEmail: { required, emailValidator },
                password: { required, passwordValidator }
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
            <label for="internalIdentifier"
                class="form-label required ">${Messages.messages.signUp.formInternalIdentifier}</label>
            <input class="form-control" name="internalIdentifier" id="internalIdentifier"
                v-model="inputs.internalIdentifier"
                :class="{ 'is-invalid': validator.inputs.internalIdentifier.$error }">
            <div class=" form-text">${Messages.messages.signUp.helpInternalIdentifier}
            </div>
            <span v-if="validator.inputs.internalIdentifier.$error">
                {{ validator.inputs.internalIdentifier.$errors[0].$message }}
            </span>
        </div>
        <div class="mb-3">
            <label for="internalEmail" class="form-label required">${Messages.messages.signUp.formInternalEmail}</label>
            <input type="email" name="internalEmail" class="form-control" id="internalEmail"
                v-model="inputs.internalEmail" :class="{ 'is-invalid': validator.inputs.internalEmail.$error }">
            <div class="form-text">${Messages.messages.signUp.helpInternalEmail}</div>
            <span v-if="validator.inputs.internalEmail.$error">
                {{ validator.inputs.internalEmail.$errors[0].$message }}
            </span>
        </div>
        <div class="mb-3">
            <label for="password" class="form-label required">${Messages.messages.signUp.formPassword}</label>
            <input type="password" name="password" class="form-control" id="password" v-model="inputs.password"
                :class="{ 'is-invalid': validator.inputs.password.$error }">
            <div class="form-text">${Messages.messages.signUp.helpPassword}</div>
            <span v-if="validator.inputs.password.$error">
                {{ validator.inputs.password.$errors[0].$message }}
            </span>
        </div>
        <button type="submit" class="btn btn-outline-dark col-12 col-md-3">${Messages.messages.signUp.submit}</button>
    </form>
</template>

<style>
.btn-outline-dark {
    background-color: var(--main-grey-color);
    border-color: var(--main-grey-color);
    float: right;

    color: var(--main-dark-color);
    letter-spacing: 0.1rem;
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

main {
    font-family: 'Source Sans Pro', sans-serif;

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