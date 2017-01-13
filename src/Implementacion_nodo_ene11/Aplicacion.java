package Implementacion_nodo_ene11;

public class Aplicacion {
	private Lista list;
	private Nodo nod1,nod2,nod3,busqueda;
	public Aplicacion(){
		super();
		System.out.println("Creacion de Nodos");
		nod1 = new Nodo("Primero", null);
		nod2 = new Nodo("Medio", null);
		nod3 = new Nodo("Ultimo",null);
		System.out.println("1 "+nod1+"\n2 "+nod2+"\n3 "+nod3+"\n");
		System.out.println("Creacion de una lista");
		list = new Lista();
		System.out.println(list.toString()+"\n");
		System.out.println("Poner primero: "+nod1.getElement());
		list.addFirst(nod1);
		System.out.println(list.toString()+"\n");
		System.out.println("Poner ultimo: "+nod3.getElement());
		list.addLast(nod3);
		System.out.println(list.toString()+"\n");
		System.out.println("Poner en medio o posicion 1: "+nod2.getElement());
		list.insertar(nod2, 1);
		System.out.println(list.toString()+"\n");
		System.out.println("remover la posicion 1: ");
		list.remove(1);
		System.out.println(list.toString()+"\n");
		System.out.println("Remover el primero: ");
		list.insertar(nod2, 1);
		list.removeFirst();
		System.out.println(list.toString()+"\n");
		System.out.println("Remover el ultimo: ");
		list.addFirst(nod1);
		list.removeLast();
		System.out.println(list.toString()+"\n");
		System.out.println("Buscar: medio");
		list.addLast(nod3);
		busqueda = list.buscar("medio");
		System.out.println(busqueda.getElement()+"\n"+busqueda.getNext().getElement()+"\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aplicacion app=new Aplicacion();
	}
}
