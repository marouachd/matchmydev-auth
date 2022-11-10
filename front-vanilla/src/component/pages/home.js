import { renderSignUpForm } from "../patterns/signUpForm.js";
import { renderSignInForm } from "../patterns/signInForm.js";
import { messages } from "../../messages.js";

function renderHome() {
    const homeContent = `
    <div class="container-xl my-5 pt-5">
        <h1>${messages.home.h1}</h1>
        <div class="row">
            <div class="col-md my-5 mx-auto">
                <h2>${messages.signIn.h1}</h2>
                <section id="section1"></section>
            </div>
            <div class="col-md my-5 mx-auto">
                <h2>${messages.signUp.h1}</h2>
                <section id="section2"></section>
            </div>
        </div>
    </div>
    `
    const main = document.getElementById("main");
    main.innerHTML = homeContent;
    renderSignInForm("section1");
    renderSignUpForm("section2");
}

export { renderHome };