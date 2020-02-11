package ar.com.buenosaires.logistica.clases;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="generador")
public class Generador {
	
	@Id
	@Column
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	@Column
	private String nombre;
	@Column 
	private String tipo;
	@Column
	private String calle;
	@Column
	private int altura;
	
	//Los metodos para la solicitud y entrada de datos.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	

}
