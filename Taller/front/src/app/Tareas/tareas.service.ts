import { Injectable } from '@angular/core';
import { Tareas } from './tareas';
import { TAREAS } from './tareas.json';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  constructor() { 
  }

   //Observable - vigilar los datos que vienen del JSON - cualquier cambio
   //actualiza
   getClientes():Observable<Tareas[]>{
    return of(TAREAS);
  }
  //este método tomar los datos del JSON para llevarlos al componente.
  /*getClientes():Cliente[]{
    return CLIENTES;
  }*/

}
