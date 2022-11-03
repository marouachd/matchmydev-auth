let messages = null;

async function initMessages() {
    const response = await fetch(`./src/resources/messages${lang}.json`); // fetch => promise
    messages = await response.json();
}

export { initMessages, messages };