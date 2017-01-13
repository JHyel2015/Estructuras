package Implementacion_nodo_ene11;

public class Lista {
	protected Nodo head; // head node of the list
	protected long size; // number of nodes in the list

	public Lista() {
		head = null;
		size=0; 
	}
	public void addFirst(Nodo v){
		v.setNext(head);
		head=v;
		size++;
	}
	public void addLast(Nodo v){
		v.setNext(null);
		Nodo tail;
		if(this.esVacia()==true){
			head=v;
			size++;
		}else{
			tail=head;
			while(tail.getNext().equals(null)==false){
				tail=tail.getNext();
				if(tail.getNext().equals(null)==true){
					tail.setNext(v);
					tail=v;
					size++;
					return;
				}
			}
			tail.setNext(v);
			tail=v;
			size++;
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
			head=head.getNext();
			temp.setNext(null);
			size--;
		}
	}
	public void removeLast(){
		Nodo tail,temp;
		if(this.esVacia()==true){
			return;
		}else{
			tail=head;;
			while(tail.getNext().equals(null)==false){
				temp=tail;
				tail=tail.getNext();
				if(tail.getNext().equals(null)==true){
					temp.setNext(null);
					tail=temp;
					return;
				}
			}
			head=null;
			size--;			
		}
	}
	public void insertar(Nodo nod,int x){
		Nodo temp1,temp2;
		if(size==0 || x>size){
			this.addLast(nod);
		}else{
			temp1=head;
			for(int i=0;i<size;i++){
				if(x==i){
					nod.setNext(temp1);
					temp1.setNext(nod);
				}
				temp1=temp1.getNext();
			}
		}
	}

}
