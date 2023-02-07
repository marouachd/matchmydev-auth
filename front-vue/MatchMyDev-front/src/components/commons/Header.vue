<script>

</script>
<template>
    <header>
        <div class="fixed-top bg-dark">
            <nav class="navbar navbar-expand-md navbar-dark container-xl">
                <a class="navbar-brand" href="/"><span class="logo">match<span class="my-color">my</span>dev</span></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarNavAltMarkup">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav">
                        <a class="nav-link" href="/">Home</a>
                        <a class="nav-link" href="/sign-in">Sign in</a>
                        <a class="nav-link" href="/admin">Accounts list</a>
                    </div>
                </div>
            </nav>
        </div>
    </header>
</template>
<style scoped>
.logo {
    color: white;
    font-family: 'Source Code Pro', monospace;
    font-weight: 600;
    font-size: 2rem;

}

.my-color {
    color: var(--main-red-color);
}

.form-text {
    color: var(--main-grey-color);
}
</style>