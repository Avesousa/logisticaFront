package ar.com.buenosaires.logistica.conexion;

import java.util.List;

import ar.com.buenosaires.logistica.clases.Generador;

public interface CGenerador {
	
	List<Generador>traer();
	Generador agregar(Generador g);
	Generador editar(Generador g);
	void eliminar(int id);

}
