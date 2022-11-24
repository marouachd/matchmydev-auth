
export default class Messages {
    static messages = null;
    static dtf = null
    static async init() {
        const response = await fetch("./src/resources/messages.json");
        const dtfOptions = { dateStyle: "full", timeStyle: "long" };
        Messages.dtf = new Intl.DateTimeFormat('en', dtfOptions);
        Messages.messages = await response.json();
    }

}





