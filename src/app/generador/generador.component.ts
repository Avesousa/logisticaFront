import { Component, OnInit } from '@angular/core';
import { ConexionService } from '../servicios/conexion.service'
import { Generador } from '../Objetos/Generador';
import { Router,Routes } from '@angular/router';
import { AgregarGeneradorComponent } from '../generador/agregar-generador/agregar-generador.component';
import { $ } from 'protractor';

@Component({
  selector: 'app-generador',
  templateUrl: './generador.component.html',
  styleUrls: ['./generador.component.css']
})
export class GeneradorComponent implements OnInit {

  generadores:Generador[];
  llaves:Routes = [
    {path:'agregarGenerador', component:AgregarGeneradorComponent}
  ];

  banderaGenerador:boolean;
  botonDisabled:boolean = false;
  constructor(private conexion:ConexionService, private rout : Router) { }

  agregarGenerador(){
      this.banderaGenerador = !this.banderaGenerador;
      this.botonDisabled = !this.botonDisabled;
  }

  ngOnInit() {
    this.conexion.ponerGeneradores().subscribe(dato=>{
      this.generadores=dato;
    });
  }

}
