package CorreccionPrueba;

public class Profesor extends Persona{

	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Profesor(String id, String nombre1, String nombre2,
			String apellido1, String apellido2, int edad) {
		super(id, nombre1, nombre2, apellido1, apellido2, edad);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return this.getId()+this.getNombre1()+this.getNombre2()+this.getApellido1()+this.getApellido2()+this.getEdad();
	}

}
