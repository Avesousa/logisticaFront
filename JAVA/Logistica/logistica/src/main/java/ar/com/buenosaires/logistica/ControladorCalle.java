package ar.com.buenosaires.logistica;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.buenosaires.logistica.clases.Calle;
import ar.com.buenosaires.logistica.conexion.CCalle;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/calles"})
public class ControladorCalle {
	
	@Autowired
	private CCalle calle;

	
	@GetMapping
	public List<Calle> mostrarGenerador(){
		List<Calle> calles = calle.traer();
		System.out.print(calles.toString());
		return calle.traer();
	}
}
