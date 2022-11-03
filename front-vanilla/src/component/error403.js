function renderError403() {
    const error403Content = `

    <h2>You already have signed-up with given identifier and email.</h2>
    `
    let main = document.getElementById("main");
    main.innerHTML = error403Content;
}

export { renderError403 };