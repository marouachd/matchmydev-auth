import BaseComponent from "../BaseComponent.js";

export default class Error500Component extends BaseComponent {
    constructor(){
        super("#main");
    }

    template(){
        return`
        <div class="container col-12 col-md-6 mx-auto my-5 pt-5">
            <h1 class="text-center ">Oops ! Error 500</h1>
            <h2 class="text-center">There is an internal server error</h2>
            <img src="sources/error500.png" alt="error500" class="img-fluid">
        <div>
        `
    }
}
