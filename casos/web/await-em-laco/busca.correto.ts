// correto: sentinel-perf-await-em-laco
export async function buscarTodos(ids: number[]) {
  return Promise.all(ids.map((id) => fetch('/api/' + id)));
}
