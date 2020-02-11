package ar.com.buenosaires.logistica.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.buenosaires.logistica.conexion.CGenerador;
import ar.com.buenosaires.logistica.clases.Generador;
import ar.com.buenosaires.logistica.repositorios.RGenerador;

@Service
public class ICGenerador implements CGenerador{

	@Autowired
	private RGenerador repositorio;
	
	@Override
	public List<Generador> traer() {
		return repositorio.findAll();
	}
	@Override
	public Generador agregar(Generador g) {
		return repositorio.save(g);
	}
	@Override
	public Generador editar(Generador g) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
