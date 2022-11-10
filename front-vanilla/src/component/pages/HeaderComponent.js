import Messages from "../../Messages.js";
import BaseComponent from "../BaseComponent.js";

export default class HeaderComponent extends BaseComponent{
    constructor(){
        super("#header");
    }

    template(){
        return`
        <div class="fixed-top bg-dark">
            <nav class="navbar navbar-expand-md navbar-dark container-xl">
                <a class="navbar-brand" href="#">${Messages.messages.brand}</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav">
                        <a class="nav-link" href="#/home">Home</a>
                        <a class="nav-link" href="#/sign-in">Sign in</a>
                    </div>
                </div>
            </nav>
        </div>
        `
    }
}