// correto: sentinel-ng-dom-direto
import { ElementRef, ViewChild } from '@angular/core';
export class C {
  @ViewChild('campo') campo!: ElementRef<HTMLInputElement>;
  focar() {
    this.campo.nativeElement.focus();
  }
}
