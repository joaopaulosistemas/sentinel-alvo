// correto: sentinel-cct-verificacao-de-tipo-em-cadeia
type Forma = { tipo: 'a'; v: number } | { tipo: 'b'; v: string };
export function f(x: Forma) {
  switch (x.tipo) { case 'a': return 1; case 'b': return 2; }
}
