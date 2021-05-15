import { Input } from '@angular/core';
import { Component } from '@angular/core';
import { Subscribers } from './Subscribers';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{
  title = 'ui-exercise';

  @Input('subscriberList')
  subscriberList: Subscribers[] = [];
}
