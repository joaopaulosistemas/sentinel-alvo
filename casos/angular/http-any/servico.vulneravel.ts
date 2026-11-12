import { HttpClient } from '@angular/common/http';
export class S {
  constructor(private http: HttpClient) {}
  listar() {
    // alvo: sentinel-ng-http-any
    return this.http.get<any>('/api/clientes');
  }
}
