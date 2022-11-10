import Messages from "../../Messages.js";
import BaseComponent from "../BaseComponent.js";
import { renderSignInForm } from "../patterns/signInForm.js";

export default class SignInComponent extends BaseComponent{
    constructor(){
        super("#main");
    }

    template(){
        return`
        <div class="container-xl col-md-6 col-12 mx-auto my-5 pt-5">
            <h1>${Messages.messages.signIn.h1}</h1>
            <section class="col-md-6 col-12 mx-auto" id="section1"></section>
        </div>
        `
    }
}