// correto: sentinel-ng-componente-sem-onpush
import { ChangeDetectionStrategy, Component } from '@angular/core';
@Component({ selector: 'app-p', template: '<p>x</p>', changeDetection: ChangeDetectionStrategy.OnPush })
export class PainelComponent {}
