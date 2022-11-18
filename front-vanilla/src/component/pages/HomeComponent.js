import FormsContent from "../patterns/FormsContent.js";

export default class HomeComponent extends BaseFormComponent {

    constructor() {
        super("#main", {
            url: null,
            method: "POST"
        });
    }

    dataModel() {
        return {
            internalIdentifier: "FMARSHALL010670",
            internalEmail: "first.last@domain.com",
            password: "Garfield2022!"
        };
    }

    template() {
        return `
        <div class="container-xl my-5 pt-5">
            <h1>${this.msg.home.h1}</h1>
            <div class="row">
                <div class="col-md my-5 mx-auto">
                    <h2>${this.msg.signIn.h1}</h2>
                    <section id="section1">
                    ${FormsContent.signInForm()}
                    </section>
                </div>
                <div class="col-md my-5 mx-auto">
                    <h2>${this.msg.signUp.h1}</h2>
                    <section id="section2">
                    ${FormsContent.signUpForm()}
                    </section>
                </div>
            </div>
        </div>
        `
    }
}

