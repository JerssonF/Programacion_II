import { Component, OnInit } from '@angular/core';
import { Tareas } from './tareas';
import { TareasService } from './tareas.service';

@Component({
  selector: 'app-Tareas',
  templateUrl: './tareas.component.html',

})
export class TareasComponent implements OnInit {
//estructura para recibir los datos de la clase cliente por medio del servicio
  tareas: Tareas[];

//crear el constructor asociado a la clase servicio
  constructor(private tareasService: TareasService){

  }
  
  ngOnInit(): void {
    //asociar al atributo clientes los datos que vienen del servicio
    //this.clientes = this.clienteService.getClientes()

    this.tareasService.getTareas().subscribe(
      clientes => this.tareas = tareas
    );
  }
}
