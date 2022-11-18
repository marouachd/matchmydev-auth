import BaseComponent from "./BaseComponent.js";

export default class BaseFormComponent extends BaseComponent {

    props = null;

    constructor(selector, props) {
        super(selector);
        this.props = props;
    }

    render() {
        super();
        const data = this.dataModel();
        const properties = Object.keys(data);
        const form = document.getElementById("signUp");
        BaseFormComponent.bind(properties, form, data);

    }

    static bind(properties, form, data) {
        properties.forEach((property) => {
            const element = form.elements[property];
            const type = element.type;
            BaseFormComponent.bindModelToview(element, type, data, property);
            BaseFormComponent.bindViewToModel(element, type, property, data);
        });
    }

    static bindModelToview(element, type, data, property) {
        if (type == "checkbox") {
            element.checked = data[property];
        } else {
            element.value = data[property];
        }
    }
    static bindViewToModel(element, type, property, data) {
        element.addEventListener("change", (event) => {
            if (type == "checkbox") {
                data[property] = element.checked;
            } else {
                data[property] = element.value;
            }
        });
    }

    dataModel() {
        return null;
    }
}
