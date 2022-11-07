import { renderSignUp } from "./signUp.js";
import { renderSignIn } from "./signIn.js";

function renderHome () {
    const homeContent = `
    <div class="container-xl my-5 pt-5">
        <h1>Login or register</h1>
        <div class="row">
            <div class="col">
                <section id="section1"></section>
            </div>
            <div class="col">
                <section id="section2"></section>
            </div>
        </div>
    </div>
    `
    const main = document.getElementById("main");
    main.innerHTML = homeContent;
    renderSignIn("section1");
    renderSignUp("section2");
}

export {renderHome};