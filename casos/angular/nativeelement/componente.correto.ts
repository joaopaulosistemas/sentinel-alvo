// correto: sentinel-ng-nativeelement-html
import { ElementRef } from '@angular/core';
export class C {
  constructor(private el: ElementRef) {}
  mostrar(t: string) {
    this.el.nativeElement.textContent = t;
  }
}
