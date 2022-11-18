import Messages from "../../Messages.js";

export default class FormsContent {

    static signInForm() {
        return `
    <form id="signIn">
        <div class="mb-3">
            <label for="identifier" class="form-label required">${Messages.messages.signIn.formIdentifier}</label>
            <input type="email" name ="identifier" class="form-control" id="identifier">
        </div>
        <div class="mb-3">
            <label for="passwordSignIn" class="form-label required">${Messages.messages.signIn.formPassword}</label>
            <input type="password" name="passwordSignIn" class="form-control" id="passwordSignIn">
        </div>
        <button type="submit" class="btn btn-outline-dark col-12 col-md-3">${Messages.messages.signIn.submit}</button>
    </form>

    `;
    }
    static signUpForm() {
        return `
        <form id="signUp">
            <div class="mb-3">
                <label for="internalIdentifier" class="form-label required ">${Messages.messages.signUp.formInternalIdentifier}</label>
                <input class="form-control" name="internalIdentifier" id="internalIdentifier" required
                    pattern="[A-Z]{2,7}[0-9]{6}">
                <div class="form-text">${Messages.messages.signUp.helpInternalIdentifier}</div>
            </div>
            <div class="mb-3">
                <label for="internalEmail" class="form-label required">${Messages.messages.signUp.formInternalEmail}</label>
                <input type="email" name="internalEmail" class="form-control" id="internalEmail" required
                    pattern="[a-zA-Z]+.[a-zA-Z]+@[a-z]+.[a-z]{2,4}$">
                <div class="form-text">${Messages.messages.signUp.helpInternalEmail}</div>
            </div>
            <div class="mb-3">
                <label for="password" class="form-label required">${Messages.messages.signUp.formPassword}</label>
                <input type="password" name="password" class="form-control" id="password" required
                    pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[%||!||*]).{8,42}">
                <div class="form-text">${Messages.messages.signUp.helpPassword}</div>
            </div>
            <button type="submit" class="btn btn-outline-dark col-12 col-md-3">${Messages.messages.signUp.submit}</button>
        </form>
    `;
    }
}