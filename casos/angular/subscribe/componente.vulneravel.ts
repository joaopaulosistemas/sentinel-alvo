import { Observable } from 'rxjs';
export class C {
  constructor(private dados$: Observable<number>) {}
  ngOnInit() {
    // alvo: sentinel-mem-subscribe-sem-desinscrever
    this.dados$.subscribe((v) => console.warn(v));
  }
}
