package ar.com.buenosaires.logistica.repositorios;

import java.util.List;
import org.springframework.data.repository.Repository;
import ar.com.buenosaires.logistica.clases.Generador;

public interface RGenerador extends Repository<Generador,Integer>{

	List<Generador> findAll();
	//Generador findOne(Generador g);
	Generador save(Generador g);
	void delete(Generador g);

}
