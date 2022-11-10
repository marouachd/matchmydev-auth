import BaseComponent from "../BaseComponent.js";

export default class Error401Component extends BaseComponent{
    constructor(){
        super("#main");
    }
    template(){
        return`
        <div class="container-fluid col-12 col-md-6 my-5 py-5 text-center">
            <h1>Error 401</h1>
            <h2>Unauthorized</h2>
            <img src="../../sources/error401.png" class="img-fluid" alt="error401">
        </div>`
    }
}