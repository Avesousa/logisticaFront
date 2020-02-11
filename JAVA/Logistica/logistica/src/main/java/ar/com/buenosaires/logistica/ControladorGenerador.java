package ar.com.buenosaires.logistica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.buenosaires.logistica.conexion.CGenerador;
import ar.com.buenosaires.logistica.clases.Generador;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/generadores"})
public class ControladorGenerador {
	
	@Autowired
	private CGenerador generador;

	
	@GetMapping
	public List<Generador> mostrarGenerador(){
		return generador.traer();
	}
	
	@PostMapping
	public Generador guardarGenerador(@RequestBody Generador g){
		return generador.agregar(g);
	}
	
}
