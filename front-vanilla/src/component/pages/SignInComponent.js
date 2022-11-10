import BaseComponent from "../BaseComponent.js";
import FormsContent from "../patterns/FormsContent.js";

export default class SignInComponent extends BaseComponent {

    constructor() {
        super("#main");
    }

    template() {
        return `
        <div class="container-xl col-md-6 col-12 mx-auto my-5 pt-5">
            <h1>${this.msg.signIn.h1}</h1>
            <section class="col-md-6 col-12 mx-auto" id="section1">
            ${FormsContent.signInForm()}
            </section>
        </div>
        `
    }
}