package CorreccionPrueba;

public class Alumno extends Persona{	

	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Alumno(String id, String nombre1, String nombre2, String apellido1, String apellido2, int edad) {
		super(id, nombre1, nombre2, apellido1, apellido2, edad);
		// TODO Auto-generated constructor stub
	}

	public String getNombre(){
		return super.getNombre1().substring(0, 1);
	}
	
	@Override
	public String toString() {
		return this.getId()+" "+this.getNombre()+" "+this.getNombre2()+" "+this.getApellido1()+" "+this.getApellido2()+" "+this.getEdad();
	}

}