// correto: sentinel-boas-ts-json-sem-validacao
import { z } from 'zod';
const Cliente = z.object({ id: z.number(), nome: z.string() });
export function ler(texto: string) {
  return Cliente.parse(JSON.parse(texto));
}
