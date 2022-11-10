import Messages from "../../Messages.js";

function renderSignInForm(path) {

    const content = `
        <form>
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
    
`

    const main = document.getElementById(`${path}`);
    main.innerHTML = content;

}

export { renderSignInForm };