import { initMessages } from "./messages.js";
import { route } from "./router.js";
import { error403 } from "./component/error403";
import { error404 } from "./component/error404";
import { error500 } from "./component/error500"


initMessages();
route();
error403();
error404();
error500();