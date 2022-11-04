function renderError403() {
    const error403Content = `
    <div class="container-xl my-5 pt-5 text-center">
        <h1>Oops ! Error 403</h1>
        <h2>Forbidden Page</h2>
        <img src="sources/error403.png" class="img-fluid" alt="403 error">
    </div>
    `
    const main = document.getElementById("main");
    main.innerHTML = error403Content;
}

export { renderError403 };