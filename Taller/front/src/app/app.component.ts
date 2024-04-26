import { Component } from '@angular/core';




@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Bievenidos a Angular';

  profesor: string = 'Julian Quimbayo';

  asignatura: string = 'Programación 3';
}

