import {messages} from "../resources/messages.json";

function renderSignUp(){
    const signUpContent = `
        <div class="container-xl my-5 pt-5">
            <h1>${messages.signUp.h1}</h1>
                <div class="row">
                    <div class=" col-12 col-md-6 mx-auto">
                        <form>
                            <div class="mb-3">
                                <label for="internalIdentifier" class="form-label required ">${messages.signUp.formInternalIdentifier}</label>
                                <input class="form-control" name="internalIdentifier" id="internalIdentifier" required
                                    pattern="[A-Z]{2,7}[0-9]{6}">
                                <div class="form-text">${messages.signUp.helpInternalIdentifier}</div>
                            </div>
                            <div class="mb-3">
                                <label for="internalEmail" class="form-label required">${messages.signUp.formInternalEmail}</label>
                                <input type="email" name="internalEmail" class="form-control" id="internalEmail" required
                                    pattern="[a-zA-Z]+.[a-zA-Z]+@[a-z]+.[a-z]{2,4}$">
                                <div class="form-text">${messages.signUp.helpInternalEmail}</div>
                            </div>
                            <div class="mb-3">
                                <label for="password" class="form-label required">${messages.signUp.formPassword}</label>
                                <input type="password" name="password" class="form-control" id="password" required
                                    pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[%||!||*]).{8,42}">
                                <div class="form-text">${messages.signUp.helpPassword}</div>
                            </div>
                            <button type="submit" class="btn btn-outline-dark col-12 col-md-3">${messages.signUp.submit}</button>
                        </form>
                    </div>
                </div>
            </div>
    `
    const main = document.getElementById("main");
    main.innerHTML = signUpContent;
}

export {renderSignUp};