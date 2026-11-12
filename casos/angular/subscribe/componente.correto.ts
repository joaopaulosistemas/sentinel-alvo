// correto: sentinel-mem-subscribe-sem-desinscrever
import { Observable, Subscription } from 'rxjs';
export class C {
  private sub?: Subscription;
  constructor(private dados$: Observable<number>) {}
  ngOnInit() {
    this.sub = this.dados$.subscribe((v) => console.warn(v));
  }
  ngOnDestroy() {
    this.sub?.unsubscribe();
  }
}
