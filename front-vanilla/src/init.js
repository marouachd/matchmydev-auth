import { initMessages } from "./messages.js";
import { renderHeader } from "./component/header.js";
import { route } from "./router.js";

await initMessages();

renderHeader();

route();
