function renderError403() {
    const error403Content = `
    <h1>Oops ! Error 403</h1>
    <h2>You already have signed-up with given identifier and email.</h2>
    `
    const main = document.getElementById("main");
    main.innerHTML = error403Content;
}

export { renderError403 };