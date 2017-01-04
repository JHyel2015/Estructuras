package CorreccionPrueba;

import java.util.Arrays;

public class Sistema {
	private Materia [] materia;
	
	public Sistema(Materia[] materias) {
		super();
		this.materia = materias;
	}	
	public Sistema() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Materia[] getMaterias(){
		return materia;
	}
	public void setMaterias(Materia[]materias){
		this.materia=materias;
	}
	@Override
	public String toString() {
		return Arrays.toString(materia);
	}
	public Materia buscarMateria(String materias){
		for(Materia m: materia ){
			if(m.getCodigo().compareToIgnoreCase(materias)==0||m.getNombre().compareToIgnoreCase(materias)==0){
				return m;
			}
		}
		return new Materia();
	}
	
}