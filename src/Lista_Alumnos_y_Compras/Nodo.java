package Lista_Alumnos_y_Compras;

public class Nodo {
	private Object elemento; // we assume elements are character strings
	private Nodo next;

	/** Creamos un nodo con un elemento y un nodo siguiente*/

	public Nodo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nodo(Object s, Nodo n) {
		elemento = s;
		next = n;
	}
	public Object getElemento() {
		return elemento; 
	}
	public Nodo getNext() {
		return next; 
	}
	// Modifier methods:
	public void setElemento(Object newElem) {
		elemento = newElem; 
	}
	public void setNext( Nodo newNext) {
		next=newNext;
	}
	@Override
	public String toString() {
		if(next!=null)
			return elemento + "\n" + next;
		else
			return ""+elemento;
	}
}
