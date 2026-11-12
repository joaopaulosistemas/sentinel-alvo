// correto: sentinel-ts-console-log
export function depurar(x: unknown, log: { debug(m: string): void }) {
  log.debug(String(x));
}
