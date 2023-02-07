<script setup>
import Header from './components/commons/Header.vue';
import { RouterView } from 'vue-router';
</script>

<template>
  <Header></Header>
  <main>
    <RouterView />
  </main>
</template>

