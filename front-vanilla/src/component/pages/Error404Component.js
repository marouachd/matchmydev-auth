import BaseComponent from "../BaseComponent.js";

export default class Error404Component extends BaseComponent{
    constructor(){
        super("#main");
    }

    template(){
        return`
        <div class="container-fluid col-12 col-md-6 my-5 py-5 text-center">
            <h1>Error 404</h1>
            <h2>Page Not Found</h2>
            <img src="sources\\error404.png" class="img-fluid" alt="error404">
        </div>    
    `
    }
}
