package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "personal")
public class Personal implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPersonal;

	@NotEmpty(message = "Ingrese el nombre*")
	@Column(name = "nPrimerNombre", nullable = false, length = 150)
	private String nPrimerNombre;

	@Column(name = "nSegundoNombre", nullable = false, length = 150)
	private String nSegundoNombre;

	@NotEmpty(message = "Ingrese el apellido paterno*")
	@Column(name = "nApellidoPaterno", nullable = false, length = 150)
	private String nApellidoPaterno;

	@NotEmpty(message = "Ingrese el apellido materno*")
	@Column(name = "nApellidoMaterno", nullable = false, length = 150)
	private String nApellidoMaterno;

	@ManyToOne
	@JoinColumn(name = "iDTipoIdentificacion", nullable = false)
	private TipoIdentificacion iDTipoIdentificacion;

	@NotNull(message = "Ingrese el Documento de identidad*")
	@Column(name = "pDNI", nullable = false)
	private String pDNI;

	@NotEmpty(message = "Cree la contraseña*")
	@Column(name = "pPassword", nullable = false, length = 150)
	private String pPassword;

	@ManyToOne
	@NotEmpty(message = "Asigne un rol*")
	@Column(name = "idRol", nullable = false)
	private Rol idRol;

//	@Transient
//	private double vzquantityMI;

	public Personal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personal(int idPersonal, @NotEmpty(message = "Ingrese el nombre*") String nPrimerNombre,
			String nSegundoNombre, @NotEmpty(message = "Ingrese el apellido paterno*") String nApellidoPaterno,
			@NotEmpty(message = "Ingrese el apellido materno*") String nApellidoMaterno,
			TipoIdentificacion iDTipoIdentificacion,
			@NotNull(message = "Ingrese el Documento de identidad*") String pDNI,
			@NotEmpty(message = "Cree la contraseña*") String pPassword,
			@NotEmpty(message = "Asigne un rol*") Rol idRol) {
		super();
		this.idPersonal = idPersonal;
		this.nPrimerNombre = nPrimerNombre;
		this.nSegundoNombre = nSegundoNombre;
		this.nApellidoPaterno = nApellidoPaterno;
		this.nApellidoMaterno = nApellidoMaterno;
		this.iDTipoIdentificacion = iDTipoIdentificacion;
		this.pDNI = pDNI;
		this.pPassword = pPassword;
		this.idRol = idRol;
	}

	public int getIdPersonal() {
		return idPersonal;
	}

	public void setIdPersonal(int idPersonal) {
		this.idPersonal = idPersonal;
	}

	public String getnPrimerNombre() {
		return nPrimerNombre;
	}

	public void setnPrimerNombre(String nPrimerNombre) {
		this.nPrimerNombre = nPrimerNombre;
	}

	public String getnSegundoNombre() {
		return nSegundoNombre;
	}

	public void setnSegundoNombre(String nSegundoNombre) {
		this.nSegundoNombre = nSegundoNombre;
	}

	public String getnApellidoPaterno() {
		return nApellidoPaterno;
	}

	public void setnApellidoPaterno(String nApellidoPaterno) {
		this.nApellidoPaterno = nApellidoPaterno;
	}

	public String getnApellidoMaterno() {
		return nApellidoMaterno;
	}

	public void setnApellidoMaterno(String nApellidoMaterno) {
		this.nApellidoMaterno = nApellidoMaterno;
	}

	public TipoIdentificacion getiDTipoIdentificacion() {
		return iDTipoIdentificacion;
	}

	public void setiDTipoIdentificacion(TipoIdentificacion iDTipoIdentificacion) {
		this.iDTipoIdentificacion = iDTipoIdentificacion;
	}

	public String getpDNI() {
		return pDNI;
	}

	public void setpDNI(String pDNI) {
		this.pDNI = pDNI;
	}

	public String getpPassword() {
		return pPassword;
	}

	public void setpPassword(String pPassword) {
		this.pPassword = pPassword;
	}

	public Rol getIdRol() {
		return idRol;
	}

	public void setIdRol(Rol idRol) {
		this.idRol = idRol;
	}
	
	

}
