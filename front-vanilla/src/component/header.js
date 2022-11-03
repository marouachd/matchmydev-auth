import { messages } from "../messages.js";

function renderHeader() {
    const content = `
    <div class="fixed-top">
        <nav class="navbar navbar-expand-md navbar-dark container-xl">
            <a class="navbar-brand" href="#">${messages.brand}</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <p>test1</p>
                    <p>test2</p>
                    <p>test3</p>
                </div>
            </div>
        </nav>
    </div>
    `

    const header = document.getElementById("header");
    header.innerHTML = content;
}

export { renderHeader };