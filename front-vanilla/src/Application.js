import Messages from "./Messages.js";
import { renderHeader } from "./component/pages/header.js";
import { route } from "./Router.js";



class Application {

    static async main() {
        await Messages.init();
        renderHeader();
        route();
    }


}

Application.main();







