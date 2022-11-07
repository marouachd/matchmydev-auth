import { renderSignUp } from "../patterns/signUp.js";
import { renderSignIn } from "../patterns/signIn.js";
import { messages } from "../../messages.js" ;

function renderHome () {
    const homeContent = `
    <div class="container-xl my-5 pt-5">
        <h1>Login or register</h1>
        <div class="row">
            <div class="col-md my-5 mx-2">
                <h2>${messages.signIn.h1}</h2>
                <section id="section1"></section>
            </div>
            <div class="col-md my-5 mx-2">
                <h2>${messages.signUp.h1}</h2>
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