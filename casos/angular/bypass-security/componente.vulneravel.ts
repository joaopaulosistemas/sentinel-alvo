import { DomSanitizer } from '@angular/platform-browser';
export class C {
  constructor(private sanitizer: DomSanitizer) {}
  html(texto: string) {
    // alvo: sentinel-ng-bypass-security
    return this.sanitizer.bypassSecurityTrustHtml(texto);
  }
}
