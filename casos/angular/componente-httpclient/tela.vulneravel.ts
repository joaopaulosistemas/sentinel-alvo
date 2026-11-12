import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
// alvo: sentinel-camadas-componente-injeta-httpclient
@Component({ selector: 'app-tela', template: '' })
export class TelaComponent {
  constructor(private http: HttpClient) {}
}
