import { ElementRef } from '@angular/core';
export class C {
  constructor(private el: ElementRef) {}
  mostrar(t: string) {
    // alvo: sentinel-ng-nativeelement-html
    this.el.nativeElement.innerHTML = t;
  }
}
