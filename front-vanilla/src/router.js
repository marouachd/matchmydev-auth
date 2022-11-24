import Error401Component from "./component/pages/Error401Component.js";
import Error403Component from "./component/pages/Error403Component.js";
import Error404Component from "./component/pages/Error404Component.js";
import Error500Component from "./component/pages/Error500Component.js";
import HeaderComponent from "./component/pages/HeaderComponent.js";
import HomeComponent from "./component/pages/HomeComponent.js";
import SignInComponent from "./component/pages/SignInComponent.js";
import AccountsListComponent from "./component/pages/AccountsListComponent.js";

export default class Router {
    static init() {
        window.addEventListener('hashchange', (event) => Router.route(event));
        const header = new HeaderComponent();
        header.render();
        Router.route();
    }
    static route(event) {
        let component = null;
        const hash = window.location.hash;
        if (hash == "" || hash == "index.html" || hash == "#/home") {
            component = new HomeComponent();
        } else if (hash == "#/sign-in") {
            component = new SignInComponent();
        } else if (hash == "#/accounts-list") {
            component = new AccountsListComponent();
        } else if (hash == "#/unauthaurized") {
            component = new Error401Component();
        } else if (hash == "#/forbidden") {
            component = new Error403Component();
        } else if (hash == "#/serverdown") {
            component = new Error500Component();
        } else {
            component = new Error404Component();
        }
        component.render();
    }
}


