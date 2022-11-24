import BaseIterableComponent from "../BaseIterableComponent.js";

export default class AccountsListComponent extends BaseIterableComponent {
    constructor() {
        super("#main", {
            url: "http://localhost:8080/useraccount",
            method: "GET",
            elementSelector: "#accountsList"
        }
        );
    }
    template() {
        return `
        <h1>Accounts list</h1>
        <div class="table-responsive my-5">
            <table class="table table-bordered ">
            <thead class="head-table">
            <tr>
                <th scope="col">Internal identifier</th>
                <th scope="col">Internal email</th>
                <th scope="col">Password</th>
                <th scope="col">Creation date</th>
                <th scope="col">Status</th>
            </tr>
        </thead>
        <tbody id="accountslist">
            
        </tbody>
            </table>
        </div>
        `
    }
    elementsTemplate(element) {

        return `
        <tr>
            <td>${element.internalIdentifier}</td>
            <td> ${element.internalEmail}</td>
            <td> ${element.password}</td>
            <td> ${element.createdAt} </td>
            <td class="text-center">
            <a href=""><i class="bi bi-circle-fill text-${element.active ? "success" : "danger"}"</i></a>
            </td>
        </tr>`
    }
}
