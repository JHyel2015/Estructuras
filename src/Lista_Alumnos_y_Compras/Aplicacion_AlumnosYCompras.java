package Lista_Alumnos_y_Compras;

/*Integrantes:  Edgar Guaman
 * 				Jorge Heredia
 */

public class Aplicacion_AlumnosYCompras {
	private ListaAlumnos lstAlumnos;
	private ListaCompras lstCompras;

	public Aplicacion_AlumnosYCompras() {
		// TODO Auto-generated constructor stub
		System.out.println("Lista de Estudiantes:\n");
		lstAlumnos = new ListaAlumnos();
		System.out.println("ingresamos a la lista algunos estudiantes:\nNombre\tCedula\n");
		lstAlumnos.add(new Alumno("Jorge", "1726479742"));
		lstAlumnos.add(new Alumno("Richard", "1726498314"));
		lstAlumnos.add(new Alumno("Maria", "1396314742"));
		lstAlumnos.add(new Alumno("Andres", "1726402542"));
		lstAlumnos.add(new Alumno("Sergio", "1874179742"));
		lstAlumnos.add(new Alumno("Manuel", "0475679742"));
		lstAlumnos.add("Edgar", 1709561355);
		System.out.println(lstAlumnos.toString()+"\n");
		System.out.println("Intentaremos ingresar un elemento repetido:\nNombre\tCedula");
		Alumno alu1=new Alumno("Richard", "1726479742");
		System.out.println(alu1+"\n");
		Nodo busqueda=lstAlumnos.buscar(alu1.getCedula());
		if(busqueda==null)
			lstAlumnos.add(alu1);
		else
			System.out.println("no se pudo ingresar el estudiante,\nporque el numero coincide con: \""+
					busqueda.getElemento()+"\"\n");
		System.out.println("busqueda de estudiante: 0475679742");
		busqueda = lstAlumnos.buscar(1726479742);
		if(busqueda!= null){
			System.out.println("El estudiante si esta en la lista:\nNombre\tCedula\n"+busqueda.getElemento()+"\n");
		}else
			System.out.println("El estudiante no esta en la lista\n");
		System.out.println("Lista de compras:\n");
		lstCompras = new ListaCompras();
		System.out.println("ingresamos a la lista algunas Compras:\nCantidad\tNombre\tEstado\n");
		lstCompras.add(3, "Latas de Atun", "listo");	
		lstCompras.add(10, "Galletas", "No");	
		lstCompras.add(1, "Fundas de Sal", "listo");	
		lstCompras.add(13, "Botellas de agua", "listo");	
		lstCompras.add(35, "Manzanas", "No");	
		lstCompras.add(8, "Fundas de azucar", "listo");	
		lstCompras.add(9, "Latas de Frijoles", "No");	
		lstCompras.add(11, "Latas de Sardina", "listo");	
		lstCompras.add(21, "Panes", "No");	
		System.out.println(lstCompras.toString()+"\n");
		System.out.println("Mostraremos las compras no completadas:\nCantidad\tNombre\tEstado\n"+
		lstCompras.toStrNoCompletos()+"\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Aplicacion_AlumnosYCompras app = new Aplicacion_AlumnosYCompras();

	}

}
