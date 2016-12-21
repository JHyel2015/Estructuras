package CorreccionPrueba;

import java.util.ArrayList;
import java.util.Arrays;

public class Materia {

	public Profesor[] getProfesores() {
		return profesores;
	}

	public void setProfesores(Profesor[] profesores) {
		this.profesores = profesores;
	}

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
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}
	
	@Override
	public String toString() {
		return "Materia [codigo=" + codigo + ", nombre=" + nombre
				+ ", numHoras=" + numHoras + ", alumnos="
				+ Arrays.toString(alumnos) + ", profesores="
				+ Arrays.toString(profesores) + "]";
	}
	
	public Profesor[]buscarProfesores(String idProfesor){
		for(Profesor p:profesores){
			if(p.getId().equals(idProfesor)){
				return
			}
		}
	}
	

	
	
}
