package ListaDoblementeEnlazada;


public class DLista {
	protected DNodo head,tail;
	protected int size;
	public DLista() {
		super();
		// TODO Auto-generated constructor stub
		this.head=new DNodo(null, null, null);
		this.tail=new DNodo(head, null, null);
		this.head.setNext(tail);
		this.size=0;

	}
	public int getSize(){
		return size;
	}
	public boolean esVacia(){
		return this.size==0;
	}
	public DNodo getHead() {
		if(esVacia()==true)
			return null;
		return head;
	}
	public DNodo getTail() {
		if(esVacia()==true)
			return null;
		return tail;
	}
	public void addFirst(Object dato){
		DNodo nodo=new DNodo(null, String.valueOf(dato), null);
		if(esVacia()==true){
			this.head=nodo;
			this.tail=nodo;
		}else{
			nodo.setNext(head);
			head.setPrev(nodo);
			head=nodo;
		}
		this.size++;
	}
	public void addLast(Object dato){
		DNodo nodo= new DNodo(null, String.valueOf(dato), null),last;
		if(esVacia()==true){
			this.head =nodo;
		}else{
			last=getTail();
			last.setNext(nodo);
			nodo.setPrev(last);
			//nodo.setNext(null);
			//this.tail=nodo;
			this.tail=nodo;
		}
		this.size++;
	}
	public void removeFirst(){
		if(esVacia()!=true){
			this.head=head.getNext();
			this.head.setPrev(null);
			this.size--;
		}
	}
	public void removeLast(){
		if(esVacia()!=true){
			DNodo last,prevLast;
			last=getTail();
			prevLast=last.getPrev();
			prevLast.setNext(null);
			this.tail=prevLast;
			this.size--;
		}
	}
	public void remove(Object dato){
		DNodo nodo =buscar(dato),next,prev;
		if(nodo!=null){
			prev=nodo.getPrev();
			next=nodo.getNext();
			if(prev==null)
				removeFirst();
			else{
				prev.setNext(next);
				next.setPrev(prev);
				this.size--;
			}
		}
	}
	public void removeX(int x){
		DNodo aux,next,prev;
		if(esVacia()!=true){
			if(x==0)
				removeFirst();
			else if(x==getSize()-1)
				removeLast();
			else{
				aux=getHead();
				for(int i =0;i<getSize();i++){
					if(i==x){
						next=aux.getNext();
						prev=aux.getPrev();
						prev.setNext(next);
						next.setPrev(prev);
						this.size--;
						break;
					}
					aux=aux.getNext();
				}
			}
		}
	}
	public DNodo buscar(Object dato){
		String busqueda=String.valueOf(dato);
		DNodo aux;
		if(esVacia()==true){
			return null;
		}else{
			aux = getHead();
			while(aux.getNext()!=null){
				if(busqueda.compareToIgnoreCase(aux.getElemento())==0){
					return aux;
				}
				aux=aux.getNext();
			}
			return null;
		}
	}
	public int point(Object dato){
		DNodo nodo=buscar(dato),aux;
		int pos=0;
		if(nodo==null)
			return -1;
		else{
			aux = getHead();
			for(pos=0;pos<getSize();pos++){
				if(aux.getElemento().compareToIgnoreCase(nodo.getElemento())==0)
					break;
				aux=aux.getNext();
			}
			return pos;
		}
	}
	public void insertar(Object dato,int x){
		DNodo nodo= new DNodo(null, String.valueOf(dato), null),aux,prev;
		if(esVacia()!=true&&x<getSize()){
			if(x==0)
				addFirst(nodo);
			else if(x>getSize())
				addLast(nodo);
			else{
				aux=getHead().getNext();
				for(int i=1;i<getSize();i++){
					if(i==x){
						prev=aux.getPrev();
						nodo.setPrev(prev);
						prev.setNext(nodo);
						aux.setPrev(nodo);
						nodo.setNext(aux);
						this.size++;
						break;
					}
					aux=aux.getNext();
				}
			}
		}
	}
	public void vaciar(){
		this.head = null;
		this.size = 0;
	}
	@Override
	public String toString() {
		return "" + head;
	}
	public String toString1() {
		return "" + tail.toString1();
	}
}
