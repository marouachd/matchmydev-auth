import { renderSignUpForm } from "../patterns/signUpForm.js";
import { renderSignInForm } from "../patterns/signInForm.js";
import Messages from "../../Messages.js";
import BaseComponent from "../BaseComponent.js";

export default class HomeComponent extends BaseComponent{
    constructor(){
        super("#main");
    }

    template(){
        return`
        <div class="container-xl my-5 pt-5">
            <h1>${Messages.messages.home.h1}</h1>
            <div class="row">
                <div class="col-md my-5 mx-auto">
                    <h2>${Messages.messages.signIn.h1}</h2>
                    <section id="section1"></section>
                </div>
                <div class="col-md my-5 mx-auto">
                    <h2>${Messages.messages.signUp.h1}</h2>
                    <section id="section2"></section>
                </div>
            </div>
        </div>
        `
    }
}

