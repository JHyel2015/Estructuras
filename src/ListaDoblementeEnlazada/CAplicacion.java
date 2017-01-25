package ListaDoblementeEnlazada;

public class CAplicacion {
	private CLista list;
	private DNodo nodA,nodZ,nodMed;

	public CAplicacion() {
		// TODO Auto-generated constructor stub
		System.out.println("Creacion de Nodos");
		nodA = new DNodo(null,"Primero", null);
		nodMed = new DNodo(null,"Posicion", null);
		nodZ = new DNodo(null,"Ultimo",null);
		System.out.println("1 "+nodA+"\n2 "+nodMed+"\n3 "+nodZ+"\n");

		System.out.println("Creacion de una lista");
		list = new CLista();
		System.out.println(list.toString()+"\n");

		System.out.println("Poner un nodo: "+nodA.getElemento());
		list.add(nodA);
		System.out.println(list.toString()+"\n");

		System.out.println("Poner en medio o posicion 1: "+nodMed.getElemento());
		list.insertar(nodMed, 1);
		System.out.println(list.toString()+"\n");

		System.out.println("remover: posicion");
		list.remove("posicion");
		System.out.println(list.toString()+"\n");

		System.out.println("Remover: ");
		list.insertar(nodMed, 1);
		list.remove();
		System.out.println(list.toString()+"\n");

		list.add(nodZ);
		list.insertar("1", 1);
		list.insertar("2", 2);
		list.insertar("4", 4);

		System.out.println("Buscar: posicion");
		DNodo busqueda = list.buscar("posicion");
		if(busqueda==null)
			System.out.println("No se encontro el dato");
		else
			System.out.println(busqueda.getElemento()+"\n"+busqueda.getNext().getElemento()+"\n");


		System.out.println("Buscar: 2");
		busqueda = list.buscar("2");
		if(busqueda==null)
			System.out.println("No se encontro el dato");
		else
			System.out.println(busqueda.getElemento()+"\n"+busqueda.getNext().getElemento()+"\n");

		System.out.println("Impresion descendente");
		System.out.println(list.toString()+"\n");

		System.out.println("Impresion ascendente");
		System.out.println(list.toString1()+"\n");

		System.out.println("Vaciamos la lista:");
		list.vaciar();
		System.out.println(list.toString()+"\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		CAplicacion app=new CAplicacion();
	}

}
