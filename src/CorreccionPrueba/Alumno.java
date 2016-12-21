package CorreccionPrueba;

public class Alumno extends Persona{	

	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre(){
		return super.getNombre1().substring(0, 1);
	}
	
	@Override
	public String toString() {
		return this.getId()+this.getNombre()+this.getNombre2()+this.getApellido1()+this.getApellido2()+this.getEdad();
	}

}
