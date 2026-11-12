import { Observable } from 'rxjs';
export function f(a$: Observable<number>, b$: (n: number) => Observable<number>) {
  // alvo: sentinel-ts-subscribe-aninhado
  a$.subscribe((n) => {
    b$(n).subscribe((m) => console.warn(m));
  });
}
