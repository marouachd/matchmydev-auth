import { messages } from "../../messages.js";
import { signInForm } from "../patterns/signInForm.js";


function renderSignIn() {
    const contentSignIn = `
    <div class="container-xl my-5 pt-5">
            <h1>${messages.signIn.h1}</h1>
            <section id="section1"></section>
        </div>
    `
    const main = document.getElementById("main");
    main.innerHTML = contentSignIn;
    signInForm("section1");

}
export { renderSignIn };