

export default class BaseComponent{
    selector = null;
    constructor(selector){
        this.selector = selector;
    }

    render(){
        const target = document.querySelector(this.selector);
        target.innerHTML = this.template();
    }
    
    template(){
        return null;
    }
}