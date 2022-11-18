export default class HttpClient {

    static async send(url, method, data) {
        const options = {
            method: method,
            headers: {
                'Content-Type': 'application/json'
            }
        };
        if (data != null) {
            options.body = JSON.stringify(data);

        }
        console.log(options);
        const response = await fetch(url, options);
        const header = response.headers;
        if (header.get("content-type") == "application/json") {
            return await response.json();
        }
        return null;
    }
}