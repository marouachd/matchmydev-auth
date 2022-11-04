import { renderSignUp } from "./component/signUp.js";
import { renderError401 } from "./component/error401.js";
import { renderError403 } from "./component/error403.js";
import { renderError404 } from "./component/error404.js";
import { renderError500 } from "./component/error500.js";

window.addEventListener('hashchange', (event) => route(event));


function route() {
    const hash = window.location.hash;
    if (hash == "" || hash == "index.html") {
        renderSignUp();
    }
    else if (hash == "#/unauthaurized") {
        renderError401();
    } else if (hash == "#/forbiden") {
        renderError403();
    } else if (hash == "#/serverdown") {
        renderError500();
    } else {
        renderError404();
    }
}

export { route };