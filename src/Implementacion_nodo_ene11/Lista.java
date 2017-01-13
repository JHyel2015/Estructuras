package Implementacion_nodo_ene11;

public class Lista {
	protected Nodo head; // head node of the list
	protected long size; // number of nodes in the list

	public Lista() {
		head = null;
		size=0; 
	}	
	public Nodo getHead() {
		return head;
	}

	public void setHead(Nodo head) {
		this.head = head;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public void addFirst(Nodo v){
		v.setNext(head);
		this.head=v;
		this.size++;
	}
	public void addLast(Nodo v){
		v.setNext(null);
		Nodo tail;
		if(this.esVacia()==true){
			this.head=v;
			this.size++;
		}else{
			tail=head;
			while(tail.getNext()!=null){
				tail=tail.getNext();
				if(tail.getNext()==null){
					tail.setNext(v);
					tail=v;
					this.size++;
					return;
				}
			}
			tail.setNext(v);
			tail=v;
			this.size++;
		}
	}
	public Boolean esVacia(){
		return head.equals(null);
	}
	public void removeFirst(){
		Nodo temp;
		if(this.esVacia()==true)
			return;
		else{
			temp=head;
			this.head=head.getNext();
			temp.setNext(null);
			size--;
		}
	}
	public void removeLast(){
		Nodo tail,temp;
		if(this.esVacia()==true){
			return;
		}else{
			tail=this.head;;
			while(tail.getNext()!=null){
				temp=tail;
				tail=tail.getNext();
				if(tail.getNext()==null){
					temp.setNext(null);
					tail=temp;
					return;
				}
			}
			this.head=null;
			this.size--;			
		}
	}
	public void remove(int x){
		Nodo temp1,aux;
		Lista list= new Lista();
		long k=this.size;
		temp1=this.head;
		aux = new Nodo(head.getElement(), null);
		if(x==0){
			this.removeFirst();
		}else if(x>size){
			this.removeLast();
		}else{
			list.addFirst(aux);
			for(int i=1;i<k;i++){
				temp1=temp1.getNext();
				if(x!=i)
					list.addLast(temp1);
			}
		}	
		this.head=list.head;
		this.size=list.size;	
	}
	public void insertar(Nodo nod,int x){
		Nodo temp=new Nodo(),aux;
		long k=this.size;
		temp=head;
		aux = new Nodo(head.getElement(), null);
		Lista list=new Lista();
		if(size==0 || x>size){
			list.addLast(nod);
		}else{
			list.addFirst(aux);
			for(int i=1;i<k+1;i++){
				if(x!=i){
					temp=temp.getNext();
					list.addLast(temp);
				}
				else
					list.addLast(nod);
			}
		}
		this.head=list.head;
		this.size=list.size;
	}
	public Nodo buscar(String strBusqueda){
		Nodo temp1;
		if(this.esVacia()==true)
			return null;
		else{
			temp1=this.head;
			for(long i=0;i<size;i++){
				if(strBusqueda.compareToIgnoreCase(temp1.getElement())==0){
					return new Nodo(temp1.getElement(),temp1.getNext());
				}
				temp1=temp1.getNext();
			}
			return null;
		}
	}
	public void vaciar(){
		this.head = null;
		this.size = 0;
	}
	@Override
	public String toString() {
		return ""+head;
	}
}
