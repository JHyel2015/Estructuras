package CorreccionPrueba;

public class Profesor extends Persona{

	public Profesor() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return this.getId()+this.getNombre1()+this.getNombre2()+this.getApellido1()+this.getApellido2()+this.getEdad();
	}

}
