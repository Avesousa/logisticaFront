package ar.com.buenosaires.logistica.repositorios;

import java.util.List;

import org.springframework.data.repository.Repository;

import ar.com.buenosaires.logistica.clases.Calle;

public interface RCalle extends Repository<Calle,Integer> {
	List<Calle>findAll();
}
