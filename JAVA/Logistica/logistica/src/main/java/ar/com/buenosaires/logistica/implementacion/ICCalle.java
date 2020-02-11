package ar.com.buenosaires.logistica.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.buenosaires.logistica.clases.Calle;
import ar.com.buenosaires.logistica.conexion.CCalle;
import ar.com.buenosaires.logistica.repositorios.RCalle;

@Service
public class ICCalle implements CCalle {

	@Autowired
	RCalle repositorio;
	
	@Override
	public List<Calle> traer() {
		return repositorio.findAll();
	}

	
	
}
