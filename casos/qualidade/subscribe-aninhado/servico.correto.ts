// correto: sentinel-ts-subscribe-aninhado
import { Observable, switchMap } from 'rxjs';
export function f(a$: Observable<number>, b$: (n: number) => Observable<number>) {
  a$.pipe(switchMap((n) => b$(n))).subscribe((m) => console.warn(m));
}
