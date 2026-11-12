import { ChangeDetectorRef, Component } from '@angular/core';
@Component({ selector: 'app-l', template: '' })
export class ListaComponent {
  constructor(private cdr: ChangeDetectorRef) {}
  atualizar() {
    // alvo: sentinel-ng-detectchanges-manual
    this.cdr.detectChanges();
  }
}
