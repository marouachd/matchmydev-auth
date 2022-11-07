import { messages } from "../../messages.js";
import { renderSignInForm } from "../patterns/signInForm.js";


function renderSignIn() {
    const contentSignIn = `
    <div class="container-xl col-md-6 col-12 mx-auto my-5 pt-5">
            <h1>${messages.signIn.h1}</h1>
            <div>
                <section class="col-md-6 col-12 mx-auto" id="section1"></section>
            </div>
        </div>
    `
    const main = document.getElementById("main");
    main.innerHTML = contentSignIn;
    renderSignInForm("section1");

}
export { renderSignIn };