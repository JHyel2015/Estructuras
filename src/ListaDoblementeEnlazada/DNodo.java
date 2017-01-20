package ListaDoblementeEnlazada;

public class DNodo {
	protected String elemento;
	protected DNodo next,prev;
	public DNodo(DNodo prev, String elemento, DNodo next) {
		super();
		this.elemento = elemento;
		this.next = next;
		this.prev = prev;
	}
	public String getElemento() {
		return elemento;
	}
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}
	public DNodo getNext() {
		return next;
	}
	public void setNext(DNodo next) {
		this.next = next;
	}
	public DNodo getPrev() {
		return prev;
	}
	public void setPrev(DNodo prev) {
		this.prev = prev;
	}
	@Override
	public String toString() {
		if(next!=null)
			return elemento +"\n"+ next;
		else
			return elemento;
	}

}
