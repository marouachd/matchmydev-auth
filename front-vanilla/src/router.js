import { renderSignUp } from "./component/signUp";
import { renderError401 } from "./Component/error401";

window.addEventListener('hashchange', (event) => route(event));

function route () {
    const hash = window.location.hash;
    if (hash == ""){
        renderSignUp();
    }
    else if (hash == "unauthaurized"){
        renderError401();
    }
}

export { route };