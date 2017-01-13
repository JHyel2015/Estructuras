package Implementacion_nodo_ene11;

public class Nodo {
	private String element; // we assume elements are character strings
	private Nodo next;

	/** Creamos un nodo con un elemento y un nodo siguiente*/

	public Nodo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nodo(String s, Nodo n) {
		element = s;
		next = n;
	}
	public String getElement() {
		return element; 
	}
	public Nodo getNext() {
		return next; 
	}
	// Modifier methods:
	public void setElement(String newElem) {
		element = newElem; 
	}
	public void setNext( Nodo newNext) {
		next=newNext;
	}
}
