import { renderHeader } from "./component/header.js";
import { initMessages } from "./messages.js";
import { route } from "./router.js";

await initMessages();

renderHeader();

route();
