export default class Messages {
    static messages = null;
    static dtf = null
    static async init() {
        const response = await fetch("../assets/messages.json");
        const dtfOptions = { month: "short", day: "numeric", year: "numeric" };
        Messages.dtf = new Intl.DateTimeFormat('en', dtfOptions);
        Messages.messages = await response.json();
    }
}