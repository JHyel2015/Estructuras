package CorreccionPrueba;

import java.util.ArrayList;
import java.util.Arrays;

public class Materia {

	private String codigo;
	private String nombre;
	private int numHoras;
	//private ArrayList<Alumno> lstAlumnos;
	//private ArrayList<Profesor> lstProfesores;
	private Alumno[] alumnos;
	private Profesor [] profesores;

	public Materia() {
		super();
		// TODO Auto-generated constructor stub
		/*this.codigo ="0";
		this.nombre="materia1";
		this.numHoras=2;
		this.profesores=new Profesor[] {new Profesor(),new Profesor()};
		this.alumnos=new Alumno[] {new Alumno(),new Alumno()};	*/	
	}
	public Materia(String codigo, String nombre, int numHoras, Alumno[] alumnos, Profesor[] profesores) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.numHoras = numHoras;
		this.alumnos = alumnos;
		this.profesores = profesores;
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
	public Profesor[] getProfesores() {
		return profesores;
	}

	public void setProfesores(Profesor[] profesores) {
		this.profesores = profesores;
	}


	@Override
	public String toString() {
		String to =codigo + "\t\t" + nombre
				+ "\t" + numHoras + "\n\nAlumnos\t\tProfesores\n";
		for(int i=0;i<alumnos.length;i++){
			for(int j=0;j<profesores.length;j++){
				if(i==j)
					to+=alumnos[i].getApellido1()+"\t\t"+profesores[j].getApellido1()+"\n";
			}
		}
		return to;
	}

	public Profesor buscarProfesores(String profesor){
		for(Profesor p: profesores){
			if(p.getId().compareToIgnoreCase(profesor)==0||p.getNombre1().compareToIgnoreCase(profesor)==0){
				return p;
			}
		}
		return new Profesor();
	}
	public Alumno buscarAlumnos(String alumno){
		for(Alumno a: alumnos){
			if(a.getId().compareToIgnoreCase(alumno)==0||a.getNombre1().compareToIgnoreCase(alumno)==0){
				return a;
			}
		}
		return new Alumno();
	}




}