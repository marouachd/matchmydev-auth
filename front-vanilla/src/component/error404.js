function renderError404() {
    const error404Content = `

    <p>"Page Not Found"</p>

    `
    let main = document.getElementById("main");
    main.innerHTML = error404Content;
}

export { renderError404 };