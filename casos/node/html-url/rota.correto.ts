// correto: sentinel-taint-html-parametro-url
const p = new URLSearchParams(location.search).get('q');
document.body.textContent = p;
