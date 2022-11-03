
function renderError401 () {
    const error401Content = `
    <h1>Oops ! Error 401</h1>
    <h2>Unauthorized</h2>
    `
    let main = document.getElementById("main");
    main.innerHTML = error401Content;
}

export { renderError401 };