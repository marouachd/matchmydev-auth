function renderError500() {
    const error500Content = `
    <h1>Oops ! Error 500</h1>
    <h2>"Je ne sais pas quoi ecrire :p "</h2>

    `
    const main = document.getElementById("main");
    main.innerHTML = error500Content;
}

export { renderError500 };