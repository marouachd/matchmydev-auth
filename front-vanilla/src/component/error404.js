function renderError404() {
    const error404Content = `
    <h1>Oops ! Error 404</h1>
    <h2>"Page Not Found"</h2>`
    const main = document.getElementById("main");
    main.innerHTML = error404Content;
}

export { renderError404 };