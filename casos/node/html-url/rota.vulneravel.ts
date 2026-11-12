const p = new URLSearchParams(location.search).get('q');
// alvo: sentinel-taint-html-parametro-url
document.body.innerHTML = p as string;
