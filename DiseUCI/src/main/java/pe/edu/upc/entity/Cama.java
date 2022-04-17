package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name="cama")
public class Cama implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCama;

	@NotEmpty(message = "Ingrese la ubicacion de la cama*")
	@Column(name="ubicacionCama", nullable=false)
	private String ubicacion;
	
	@NotEmpty(message = "Ingrese la disponibilidad de la cama*")
	@Column(name="disponibilidad", nullable=false)
	boolean disponible;
	


	public Cama() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cama(int idCama, @NotEmpty(message = "Ingrese la ubicacion de la cama*") String ubicacion,
			@NotEmpty(message = "Ingrese la disponibilidad de la cama*") boolean disponible) {
		super();
		this.idCama = idCama;
		this.ubicacion = ubicacion;
		this.disponible = disponible;
	}


	public int getIdCama() {
		return idCama;
	}


	public void setIdCama(int idCama) {
		this.idCama = idCama;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	


}
