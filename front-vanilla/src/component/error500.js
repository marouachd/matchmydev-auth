function renderError500() {
    const error500Content = `

    <p>"Je ne sais pas quoi ecrire :p "</p>

    `
    let main = document.getElementById("main");
    main.innerHTML = error500Content;
}

export { renderError500 };