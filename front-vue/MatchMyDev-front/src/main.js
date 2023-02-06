import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios';

const app = createApp(App);
const myAxios = axios.create({
    baseURL: "http://localhost:8080"
})

app.config.globalProperties.$axios = myAxios;

app.use(router);

app.mount('#app');
