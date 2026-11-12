// correto: sentinel-node-exec-dinamico
import { execFile } from 'child_process';
export function f(arq: string) {
  execFile('convert', [arq, 'saida.png']);
}
