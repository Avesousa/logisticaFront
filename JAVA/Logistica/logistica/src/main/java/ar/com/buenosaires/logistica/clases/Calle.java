package ar.com.buenosaires.logistica.clases;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="uso")
public class Calle {
	
	@Id
	@Column
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	@Column
	private double x;
	@Column
	private double y; 
	@Column
	private String smp;
	@Column
	private String calle;
	@Column
	private int altura;
	@Column
	private String tipo;
	@Column
	private int piso;
	@Column
	private String nombre;
	@Column
	private String barrio;
	@Column
	private int comuna; 
	@Column
	private String rama;
	@Column
	private String subrama;
	@Column
	private String ssrama;
	
	
	//Los metodos para la solicitud y entrada de datos.
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getSmp() {
		return smp;
	}
	public void setSmp(String smp) {
		this.smp = smp;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public int getComuna() {
		return comuna;
	}
	public void setComuna(int comuna) {
		this.comuna = comuna;
	}
	public String getRama() {
		return rama;
	}
	public void setRama(String rama) {
		this.rama = rama;
	}
	public String getSubrama() {
		return subrama;
	}
	public void setSubrama(String subrama) {
		this.subrama = subrama;
	}
	public String getSsrama() {
		return ssrama;
	}
	public void setSsrama(String ssrama) {
		this.ssrama = ssrama;
	}

	@Override
	public String toString() {
		return calle + " - " + altura + " - " + id;
	}

}
