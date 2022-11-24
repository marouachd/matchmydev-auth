import BaseComponent from "./BaseComponent.js";
import HttpClient from "../HttpClient.js"

export default class BaseIterableComponent extends BaseComponent {
    props = null;

    constructor(selector, props) {
        super(selector);
        this.props = props;
    }

    async render() {
        super.render();

        const elements = await HttpClient.send(this.props.url, this.props.method);
        let elementsTarget = this.target.querySelector(this.props.elementSelector);
        let content = " ";
        elements.forEach(element => {
            content += this.elementsTemplate(element);
        });
        elementsTarget.innerHTML = content;
    }
    elementsTemplate(element) {
        return null;
    }
}