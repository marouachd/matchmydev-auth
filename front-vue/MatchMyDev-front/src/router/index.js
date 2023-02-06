import { createRouter, createWebHistory } from "vue-router";
import Home from '../components/Home.vue';
import SignInPage from '../components/SignInPage.vue';
import Admin from '../components/Admin.vue';

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
        {
            path: '/',
            name: 'home',
            component: Home
        },
        {
            path: '/sign-in',
            name: 'sign-in',
            component: SignInPage
        },
        {
            path: '/admin',
            name: 'admin',
            component: Admin
        }
    ]
})

export default router