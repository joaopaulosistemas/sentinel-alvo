// correto: sentinel-ng-bypass-security
import { DomSanitizer } from '@angular/platform-browser';
export class C {
  constructor(private sanitizer: DomSanitizer) {}
  html(texto: string) {
    return this.sanitizer.sanitize(1, texto);
  }
}
