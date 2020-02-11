import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GeneradorComponent } from './generador/generador.component';
import { RemitoComponent } from './remito/remito.component';
import { FormsModule } from '@angular/forms';
import { ConexionService } from '../app/servicios/conexion.service'
import { HttpClientModule } from '@angular/common/http';
import { AgregarGeneradorComponent } from './generador/agregar-generador/agregar-generador.component'

@NgModule({
  declarations: [
    AppComponent,
    GeneradorComponent,
    RemitoComponent,
    AgregarGeneradorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ConexionService],
  bootstrap: [AppComponent]
})
export class AppModule { }
