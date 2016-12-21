package CorreccionPrueba;

import java.util.ArrayList;

public class Materia {
	
	private String codigo;
	private String nombre;
	private int numHoras;
	//private ArrayList<Alumno> lstAlumnos;
	//private ArrayList<Profesor> lstProfesores;
	private Alumno[] alumnos;
	private Profesor [] profesores;

	public Materia() {
		// TODO Auto-generated constructor stub
		this.codigo ="0";
		this.nombre="materia1";
		this.numHoras=2;
		this.profesores=new Profesor[] {new Profesor(),new Profesor()};
		this.alumnos=new Alumno[] {new Alumno(),new Alumno()};
		
	}

}
