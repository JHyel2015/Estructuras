package CorreccionPrueba;

import javax.swing.JOptionPane;

public class Aplicacion {

	private Materia mat1,mat2,mat3,materias[];
	private Profesor prof1,prof2,prof3,prof4,prof5;
	private Alumno alum1,alum2,alum3,alum4,alum5;

	public Aplicacion() {
		// TODO Auto-generated constructor stub
		int op=0;
		String[] opciones = {"Materias","Profesores","Alumnos"};

		alum1=new Alumno("201511223", "Richard", "Jorge", "Heredia", "Guagchinga", 21);
		alum2=new Alumno("201657891", "Arturo", "alu2", "Huertas", "alu2", 21);
		alum3=new Alumno("201459623", "Michelle", "alu3", "Villacres", "alu3", 21);
		alum4=new Alumno("201259871", "Jose", "alu4", "Carvajal", "alu4", 21);
		alum5=new Alumno("201259871", "Luis", "alu5", "Cedillo", "alu5", 21);

		prof1 = new Profesor("171409709", "Paul", "pro1", "Davila", "ape1", 40);
		prof2 = new Profesor("171165709", "Elisa", "pro2", "Mena", "ape2", 32);
		prof3 = new Profesor("171404609", "Andres", "pro3", "Larco", "ape3", 52);
		prof4 = new Profesor("171491509", "Pedro", "pro4", "Romo", "ape4", 50);
		prof5 = new Profesor("121609709", "Sheyla", "pro5", "Noboa", "ape5", 41);

		mat1 = new Materia("FIS251", "Fisica", 5, new Alumno[]{alum2,alum3,alum5,alum1}, new Profesor[]{prof3,prof5,prof1,prof4});
		mat2 = new Materia("SIS316", "Arquitectura", 6, new Alumno[]{alum5,alum3,alum4,alum2}, new Profesor[]{prof3,prof2,prof5,prof4});
		mat3 = new Materia("SIS341", "Estructura", 4, new Alumno[]{alum2,alum5,alum4,alum1}, new Profesor[]{prof2,prof5,prof1,prof3});

		materias = new Materia[]{mat1, mat2,mat3};

		op=JOptionPane.showOptionDialog(null, "Seleccione una opcion de Listas", "Obtener Listas", 0, 3, null, opciones, null);
		switch (op) {
		case 0:
			Sistema sys = new Sistema(materias);
			Materia mat=sys.buscarMateria(JOptionPane.showInputDialog("Escriba el nombre o codigo de la materia"));
			if(mat.equals(new Materia())==false){
				System.out.println("Codigo\t\tNombre\tNum. Horas");
				System.out.println(mat.toString());
				break;
			}else{
				System.out.println("La materia no existe");
				break;	
			}
		case 1:
			String busqueda= JOptionPane.showInputDialog("Escriba el id o nombre del Profesor");
			//for(Profesor pro: profesores){
				//if(pro.getId().equals(busqueda)){
					//System.out.println("ID\tNombres\t\tApellidos\t\tEdad\n"+pro.toString()+"\nMaterias\tAlumnos");
					for(Materia m: materias){
						Profesor p=m.buscarProfesores(busqueda);
						//if(p.equals(pro)){
						if(p.equals(new Profesor())==false){
							System.out.println("ID\tNombres\t\tApellidos\t\tEdad\n"+p.toString()+"\nMaterias\t\tAlumnos");
							System.out.print("\n"+m.getNombre()+"\t\t");
							for(Alumno al:m.getAlumnos()){
								System.out.print(al.getApellido1()+" ");
							}
						}
					}
					//break;
				//}
			//}
			break;
		case 2:
			busqueda = JOptionPane.showInputDialog("Escriba el id o nombre del Alumno");
			//for(Alumno al: alumnos){
				//if(al.getId().equals(busqueda)){
					//System.out.println("ID\tNombres\t\tApellidos\t\tEdad\n"+al.toString()+"\nMaterias\tProfesores\n");
					for(Materia m: materias){
						Alumno alum = m.buscarAlumnos(busqueda);
						//if(alum.equals(al)){
							if(alum.equals(new Alumno())==false){
								System.out.println("ID\tNombres\t\tApellidos\t\tEdad\n"+alum.toString()+"\nMaterias\tProfesores\n");
							System.out.print("\n"+m.getNombre()+"\t");
							for(Profesor pro:m.getProfesores()){
								System.out.print(pro.getApellido1()+" ");								
							}
						}
					}
					//break;
				//}
			//}
			break;			
		default:
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Aplicacion app= new Aplicacion();
	}

}