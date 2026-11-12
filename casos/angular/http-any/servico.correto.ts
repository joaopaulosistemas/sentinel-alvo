// correto: sentinel-ng-http-any
import { HttpClient } from '@angular/common/http';
interface Cliente { id: number; nome: string }
export class S {
  constructor(private http: HttpClient) {}
  listar() {
    return this.http.get<Cliente[]>('/api/clientes');
  }
}
