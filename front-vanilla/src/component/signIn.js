import { messages } from "../messages.js";

function renderSignIn() {

    const content = `
<div class="container-xl my-5 pt-5">
    <h1>${messages.signIn.h1}</h1>
    <div class="row">
        <div class=" col-12 col-md-6 mx-auto">

            <form>
                <div class="mb-3">
                    <label for="identifier" class="form-label required">${messages.signIn.formIdentifier}</label>
                    <input type="email" name ="identifier" class="form-control" id="identifier">
                </div>
                <div class="mb-3">
                    <label for="passwordSignIn" class="form-label required">${messages.signIn.formPassword}</label>
                    <input type="password" name="passwordSignIn" class="form-control" id="passwordSignIn">
                </div>

                <button type="submit" class="btn btn-outline-dark col-12 col-md-3">${messages.signIn.submit}</button>
            </form>
        </div>
    </div>
</div>
`

    const main = document.getElementById("main");
    main.innerHTML = content;

}

export { renderSignIn };