package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Alumno")
@Table(name="talumnos")
public class Alumno {
	@Column(name="apellidosalumno")
	private String apellidosalumno;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codigoalumno;
	@Column(name="direccionalumno")
	private String direccionalumno;
	@Column(name="dnialumno")
	private String dnialumno;
	@Column(name="nombrealumno")
	private String nombrealumno;
	
	public Alumno() {}

	public Alumno(String apellidosalumno, String codigoalumno, String direccionalumno, String dnialumno,
			String nombrealumno) {
		super();
		this.apellidosalumno = apellidosalumno;
		this.codigoalumno = codigoalumno;
		this.direccionalumno = direccionalumno;
		this.dnialumno = dnialumno;
		this.nombrealumno = nombrealumno;
	}
	
	public Alumno(String apellidosalumno, String direccionalumno, String dnialumno,
			String nombrealumno) {
		super();
		this.apellidosalumno = apellidosalumno;
		
		this.direccionalumno = direccionalumno;
		this.dnialumno = dnialumno;
		this.nombrealumno = nombrealumno;
	}

	public String getApellidosalumno() {
		return apellidosalumno;
	}

	public void setApellidosalumno(String apellidosalumno) {
		this.apellidosalumno = apellidosalumno;
	}

	public String getCodigoalumno() {
		return codigoalumno;
	}

	public void setCodigoalumno(String codigoalumno) {
		this.codigoalumno = codigoalumno;
	}

	public String getDireccionalumno() {
		return direccionalumno;
	}

	public void setDireccionalumno(String direccionalumno) {
		this.direccionalumno = direccionalumno;
	}

	public String getDnialumno() {
		return dnialumno;
	}

	public void setDnialumno(String dnialumno) {
		this.dnialumno = dnialumno;
	}

	public String getNombrealumno() {
		return nombrealumno;
	}

	public void setNombrealumno(String nombrealumno) {
		this.nombrealumno = nombrealumno;
	}

	@Override
	public String toString() {
		return "Alumno [apellidosalumno=" + apellidosalumno + ", codigoalumno=" + codigoalumno + ", direccionalumno="
				+ direccionalumno + ", dnialumno=" + dnialumno + ", nombrealumno=" + nombrealumno + "]";
	}
	
	
	

}
