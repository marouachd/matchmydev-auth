import BaseComponent from "../BaseComponent.js";

export default class Error403Component extends BaseComponent{
    constructor(){
        super("#main");
    }

    template(){
        return `
        <div class="container-xl my-5 pt-5 text-center">
            <h1>Oops ! Error 403</h1>
            <h2>Forbidden Page</h2>
            <img src="sources/error403.png" class="img-fluid" alt="403 error">
        </div>
        `
    }
}