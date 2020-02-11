import { Component, OnInit } from '@angular/core';
import { Calle } from '../../Objetos/Calle';
import { TipoFrente } from '../../Objetos/TipoFrente';
import { ConexionService } from '../../servicios/conexion.service';

@Component({
  selector: 'app-agregar-generador',
  templateUrl: './agregar-generador.component.html',
  styleUrls: ['./agregar-generador.component.css']
})
export class AgregarGeneradorComponent implements OnInit {

  calles:Calle[];
  tiposDeFrente:TipoFrente[];
  
  constructor(private conexion:ConexionService) { }

  ngOnInit() {
    this.conexion.ponerCalles().subscribe(dato=>{
      this.calles=dato;
    });
    this.conexion.ponerTiposDeFrente().subscribe(dato=>{
      this.tiposDeFrente = dato;
    })
  }
  

}
