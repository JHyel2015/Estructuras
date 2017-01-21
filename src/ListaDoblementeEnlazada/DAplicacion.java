package ListaDoblementeEnlazada;


public class DAplicacion {
	private DLista list;
	private DNodo nodA,nodZ,nodMed;
	
	public DAplicacion(){
		System.out.println("Creacion de Nodos");
		nodA = new DNodo(null,"Primero", null);
		nodMed = new DNodo(null,"Posicion", null);
		nodZ = new DNodo(null,"Ultimo",null);
		System.out.println("1 "+nodA+"\n2 "+nodMed+"\n3 "+nodZ+"\n");
		
		System.out.println("Creacion de una lista");
		list = new DLista();
		System.out.println(list.toString()+"\n");
		
		System.out.println("Poner primero: "+nodA.getElemento());
		list.addFirst(nodA);
		System.out.println(list.toString()+"\n");
		
		System.out.println("Poner ultimo: "+nodZ.getElemento());
		list.addLast(nodZ);
		System.out.println(list.toString()+"\n");
		
		System.out.println("Poner en medio o posicion 1: "+nodMed.getElemento());
		list.insertar(nodMed, 1);
		System.out.println(list.toString()+"\n");
		
		System.out.println("remover: posicion");
		list.remove("posicion");
		System.out.println(list.toString()+"\n");
		
		System.out.println("Remover el primero: ");
		list.insertar(nodMed, 1);
		list.removeFirst();
		System.out.println(list.toString()+"\n");
		
		System.out.println("Remover el ultimo: ");
		list.addFirst(nodA);
		list.removeLast();
		System.out.println(list.toString()+"\n");
		list.addLast(nodZ);
		list.insertar("1", 1);
		list.insertar("2", 2);
		list.insertar("4", 4);
		
		System.out.println("Buscar: posicion");
		DNodo busqueda = list.buscar("posicion");
		System.out.println(busqueda.getElemento()+"\n"+busqueda.getNext().getElemento()+"\n");
		

		System.out.println("Buscar: 2");
		busqueda = list.buscar("2");
		System.out.println(busqueda.getElemento()+"\n"+busqueda.getNext().getElemento()+"\n");
		
		System.out.println("Vaciamos la lista:");
		list.vaciar();
		System.out.println(list.toString()+"\n");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		DAplicacion app = new DAplicacion();

	}

}
