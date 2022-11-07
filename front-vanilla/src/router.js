import { renderError401 } from "./component/pages/error401.js";
import { renderError403 } from "./component/pages/error403.js";
import { renderError404 } from "./component/pages/error404.js";
import { renderError500 } from "./component/pages/error500.js";
import { renderHome } from "./component/pages/home.js";

window.addEventListener('hashchange', (event) => route(event));


function route() {
    const hash = window.location.hash;
    if (hash == "" || hash == "index.html") {
        renderHome();
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