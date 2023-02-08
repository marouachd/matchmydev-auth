import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import axios from './plugins/axios';
import './assets/styles.css';
import './assets/forms.css';

const app = createApp(App);

app.use(router);
app.use(axios);

app.mount('#app');
