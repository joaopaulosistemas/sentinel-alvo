// correto: sentinel-ng-detectchanges-manual
import { ChangeDetectorRef, Component } from '@angular/core';
@Component({ selector: 'app-l', template: '' })
export class ListaComponent {
  constructor(private cdr: ChangeDetectorRef) {}
}
