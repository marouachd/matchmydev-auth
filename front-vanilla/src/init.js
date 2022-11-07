import { initMessages } from "./messages.js";
import { renderHeader } from "./component/pages/header.js";
import { route } from "./router.js";

await initMessages();

renderHeader();

route();


