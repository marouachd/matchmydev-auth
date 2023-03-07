import { createRouter, createWebHistory } from "vue-router";
import Home from '../components/HomePage.vue';
import SignInPage from '../components/SignInPage.vue';
import Admin from '../components/Admin.vue';
import CreateAccount from '../components/commons/CreateAccount.vue'
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
        },
        {
            path: '/create-account',
            name: 'create-account',
            component: CreateAccount
        },
    ]
})

export default router