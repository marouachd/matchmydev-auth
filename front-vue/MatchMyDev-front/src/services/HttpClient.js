import axios from "axios";

export default class HttpClient {

    instance = axios.create({
        baseURL: 'https://localhost:8080/'
    });

    static async get(endpoint) {
        this.instance.get(endpoint).then(function (response) {
            // const header = response.headers;
            // return await response.json();
            console.log("YEAH");
        }).catch(function (error) {
            console.log('nnnnooooooooo');
        }).then(function () {
            console.log("joker");
        });
    }
    static async post(endpoint, data) {

        this.instance.post(endpoint, data).then(function (response) {
            if (response.status == 204) {
                return true;
            } else
                return false;
        }).catch(function (error) {
            console.log(error);
        });
    }
}