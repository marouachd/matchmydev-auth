function renderError404() {
    const error404Content = `
    <div class="container-fluid col-12 col-md-6 my-5 py-5 text-center">
        <h1>Error 404</h1>
        <h2>Page Not Found</h2>
        <img src="sources\\error404.png" class="img-fluid" alt="error404">
    </div>    
    `

    const main = document.getElementById("main");
    main.innerHTML = error404Content;
}

export { renderError404 };