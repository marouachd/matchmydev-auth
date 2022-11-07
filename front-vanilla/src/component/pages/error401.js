
function renderError401() {
    const error401Content = `
    <div class="container-fluid col-12 col-md-6 my-5 py-5 text-center">
        <h1>Error 401</h1>
        <h2>Unauthorized</h2>
        <img src="../../sources/error401.png" class="img-fluid" alt="error401">
    </div>    
    `
    const main = document.getElementById("main");
    main.innerHTML = error401Content;
}

export { renderError401 };