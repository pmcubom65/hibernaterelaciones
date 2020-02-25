package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
@Entity(name="detalle")
@Table(name="talumnosdetalles")
public class AlumnoDetalle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codigoalumnodetalle;
	
    @OneToOne(targetEntity=Alumno.class, cascade={CascadeType.ALL})
    @PrimaryKeyJoinColumn
    @JoinColumn(name="codigoalumno", nullable = false)
	private Alumno codigoalumnodetalleenlace;
	
	
	private String evaluacionalumnodetalle;
	private String moduloalumnodetalle;
	private String notamoduloalumnodetalle;
	
	public AlumnoDetalle(){}

	public AlumnoDetalle(String codigoalumnodetalle, Alumno codigoalumnodetalleenlace, String evaluacionalumnodetalle,
			String moduloalumnodetalle, String notamoduloalumnodetalle) {
		super();
		this.codigoalumnodetalle = codigoalumnodetalle;
		this.codigoalumnodetalleenlace = codigoalumnodetalleenlace;
		this.evaluacionalumnodetalle = evaluacionalumnodetalle;
		this.moduloalumnodetalle = moduloalumnodetalle;
		this.notamoduloalumnodetalle = notamoduloalumnodetalle;
	}
	
	
	
	public AlumnoDetalle( Alumno codigoalumnodetalleenlace, String evaluacionalumnodetalle,
			String moduloalumnodetalle, String notamoduloalumnodetalle) {
	
		
		this.codigoalumnodetalleenlace = codigoalumnodetalleenlace;
		this.evaluacionalumnodetalle = evaluacionalumnodetalle;
		this.moduloalumnodetalle = moduloalumnodetalle;
		this.notamoduloalumnodetalle = notamoduloalumnodetalle;
	}

	public String getCodigoalumnodetalle() {
		return codigoalumnodetalle;
	}

	public void setCodigoalumnodetalle(String codigoalumnodetalle) {
		this.codigoalumnodetalle = codigoalumnodetalle;
	}

	public Alumno getCodigoalumnodetalleenlace() {
		return codigoalumnodetalleenlace;
	}

	public void setCodigoalumnodetalleenlace(Alumno codigoalumnodetalleenlace) {
		this.codigoalumnodetalleenlace = codigoalumnodetalleenlace;
	}

	public String getEvaluacionalumnodetalle() {
		return evaluacionalumnodetalle;
	}

	public void setEvaluacionalumnodetalle(String evaluacionalumnodetalle) {
		this.evaluacionalumnodetalle = evaluacionalumnodetalle;
	}

	public String getModuloalumnodetalle() {
		return moduloalumnodetalle;
	}

	public void setModuloalumnodetalle(String moduloalumnodetalle) {
		this.moduloalumnodetalle = moduloalumnodetalle;
	}

	public String getNotamoduloalumnodetalle() {
		return notamoduloalumnodetalle;
	}

	public void setNotamoduloalumnodetalle(String notamoduloalumnodetalle) {
		this.notamoduloalumnodetalle = notamoduloalumnodetalle;
	}

	@Override
	public String toString() {
		return "AlumnoDetalle [codigoalumnodetalle=" + codigoalumnodetalle + ", codigoalumnodetalleenlace="
				+ codigoalumnodetalleenlace + ", evaluacionalumnodetalle=" + evaluacionalumnodetalle
				+ ", moduloalumnodetalle=" + moduloalumnodetalle + ", notamoduloalumnodetalle="
				+ notamoduloalumnodetalle + "]";
	}
	
	

}
