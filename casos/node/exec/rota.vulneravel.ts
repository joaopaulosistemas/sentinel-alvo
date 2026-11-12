import { exec } from 'child_process';
export function f(arq: string) {
  // alvo: sentinel-node-exec-dinamico
  exec('convert ' + arq + ' saida.png');
}
