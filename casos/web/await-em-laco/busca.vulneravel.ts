export async function buscarTodos(ids: number[]) {
  const r = [];
  // alvo: sentinel-perf-await-em-laco
  for (const id of ids) {
    r.push(await fetch('/api/' + id));
  }
  return r;
}
