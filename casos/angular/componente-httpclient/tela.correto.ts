// correto: sentinel-camadas-componente-injeta-httpclient
import { Component } from '@angular/core';
import { ClienteService } from './cliente.service';
@Component({ selector: 'app-tela', template: '' })
export class TelaComponent {
  constructor(private clientes: ClienteService) {}
}
