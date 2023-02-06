<script setup>
import SignIn from './commons/SignIn.vue';
import SignUp from './commons/SignUp.vue';
</script>

<template>
    <div class="container-xl my-5 pt-5">
        <h1>${this.msg.home.h1}</h1>
        <div class="row">
            <div class="col-md my-5 mx-auto">
                <h2>${this.msg.signIn.h1}</h2>
                <section id="section1">
                    <SignIn></SignIn>
                </section>
            </div>
            <div class="col-md my-5 mx-auto">
                <h2>${this.msg.signUp.h1}</h2>
                <section id="section2">
                    <SignUp></SignUp>
                </section>
            </div>
        </div>
    </div>
</template>