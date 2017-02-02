package Lista_Alumnos_y_Compras;

public class ListaCompras {
	protected Nodo head; // head node of the list
	protected long size; // number of nodes in the list


	public ListaCompras() {
		// TODO Auto-generated constructor stub
		this.head=new Nodo();
		this.size=0;
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
	public void add(Compras v){
		Nodo newNodo = new Nodo(v, null),tail,busqueda;
		newNodo.setNext(null);
		if(this.esVacia()==true){
			this.head=newNodo;
			this.size++;
		}else{
			tail=head;
			while(tail.getNext()!=null){
				tail=tail.getNext();
				if(tail.getNext()==null){
					tail.setNext(newNodo);
					tail=newNodo;
					this.size++;
					return;
				}
			}
			tail.setNext(newNodo);
			tail=newNodo;
			this.size++;
		}
	}
	public void add(int cant,Object nombre,Object listo){
		Compras alu=new Compras(cant,String.valueOf(nombre),String.valueOf(listo));
		add(alu);
	}
	public Boolean esVacia(){
		return getSize()==0;
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
	public Nodo buscar(Object dato){
		Nodo temp1;
		String strBusqueda = String.valueOf(dato);
		Compras compra;
		if(this.esVacia()==true)
			return null;
		else{
			temp1=this.head;
			for(long i=0;i<size;i++){
				compra=(Compras)temp1.getElemento();
				if(strBusqueda.compareToIgnoreCase(compra.getNombre())==0){
					return new Nodo(temp1.getElemento(),temp1.getNext());
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
	public String toStrNoCompletos(){
		Nodo nod=getHead();
		Compras comp;
		String strPrin="";
		while(nod.getNext()!=null){
			comp=(Compras)nod.getElemento();
			if(comp.isListo()!=true)
				strPrin+=""+comp+"\n";
			nod=nod.getNext();				
		}
		return strPrin;
	}

}
