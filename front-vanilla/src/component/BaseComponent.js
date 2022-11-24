import Messages from "../Messages.js";

export default class BaseComponent {
    msg = Messages.messages;
    dtfFormat = (str) => {
        const date = new Date(str);
        return Messages.dtf.format(date);
    };
    selector = null;
    target = null;


    constructor(selector) {
        this.selector = selector;
    }

    render() {
        this.target = document.querySelector(this.selector);
        this.target.innerHTML = this.template();
    }

    template() {
        return null;
    }
}