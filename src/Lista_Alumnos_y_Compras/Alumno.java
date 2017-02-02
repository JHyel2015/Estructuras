package Lista_Alumnos_y_Compras;

public class Alumno {
	private String nombre,cedula;

	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, String cedula) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return nombre + "\t" + cedula;
	}

}
