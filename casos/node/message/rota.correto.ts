// correto: sentinel-message-listener-sem-origem
window.addEventListener('message', (e) => {
  if (e.origin !== 'https://app.exemplo.com') { return; }
  console.warn(e.data);
});
