import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GeneradorComponent } from './generador/generador.component';
import { RemitoComponent } from './remito/remito.component';
import { AgregarGeneradorComponent } from './generador/agregar-generador/agregar-generador.component';


const routes: Routes = [

  {path:'generador', component: GeneradorComponent },
  {path:'remito', component: RemitoComponent},
  {path:'agregarGenerador', component:AgregarGeneradorComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
