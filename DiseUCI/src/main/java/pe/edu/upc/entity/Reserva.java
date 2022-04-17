package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Reserva")
public class Reserva implements Serializable {
	private static final long  serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "idenfermera", nullable = false)
	private Personal paciente;
	
	@ManyToOne
	@JoinColumn(name = "idcama", nullable = false)
	private Cama cama;
	
	@ManyToOne
	@JoinColumn(name = "iddoctor", nullable = false)
	private Personal doctor;
	
	@ManyToOne
	@JoinColumn(name = "idenfermera", nullable = false)
	private Personal enfermera;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fechaReserva")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechaReserva;
	
	@Temporal(TemporalType.TIME)
	@Column(name="horaReserva")
	@DateTimeFormat(pattern = "HH:mm")
	private Date horaReserva;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fechaSalida")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechaSalida;
	
	@Temporal(TemporalType.TIME)
	@Column(name="horaSalida")
	@DateTimeFormat(pattern = "HH:mm")
	private Date horaSalida;
	
	@Column(name="nombrePregunta", nullable=false)
	private String observaciones;

	public Reserva(int id, Personal idpaciente, Cama idcama, Personal iddoctor, Personal idenfermera, Date fechaReserva, Date horaReserva,
			Date fechaSalida, Date horaSalida, String observaciones) {
		super();
		this.id = id;
		this.paciente = idpaciente;
		this.cama = idcama;
		this.enfermera = idenfermera;
		this.doctor = iddoctor;
		this.fechaReserva = fechaReserva;
		this.horaReserva = horaReserva;
		this.fechaSalida = fechaSalida;
		this.horaSalida = horaSalida;
		this.observaciones = observaciones;
	}

	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Personal getPaciente() {
		return paciente;
	}

	public void setPaciente(Personal paciente) {
		this.paciente = paciente;
	}

	public Cama getCama() {
		return cama;
	}

	public void setCama(Cama cama) {
		this.cama = cama;
	}

	public Personal getDoctor() {
		return doctor;
	}

	public void setDoctor(Personal doctor) {
		this.doctor = doctor;
	}

	public Personal getEnfermera() {
		return enfermera;
	}

	public void setEnfermera(Personal enfermera) {
		this.enfermera = enfermera;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public Date getHoraReserva() {
		return horaReserva;
	}

	public void setHoraReserva(Date horaReserva) {
		this.horaReserva = horaReserva;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
}
