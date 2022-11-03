import { renderSignUp } from "./component/signUp.js";
import { renderError401 } from "./component/error401.js";

window.addEventListener('hashchange', (event) => route(event));


function route() {
    const hash = window.location.hash;
    if (hash == "" || hash == "index.html") {
        renderSignUp();
    }
    else if (hash == "unauthaurized") {
        renderError401();
    }
}

export { route };