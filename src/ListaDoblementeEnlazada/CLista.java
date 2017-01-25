package ListaDoblementeEnlazada;

public class CLista {
	protected DNodo inicio;
	protected int size;

	public CLista() {
		// TODO Auto-generated constructor stub
		this.inicio=new DNodo(null, null, null);
		this.size=0;
	}
	public DNodo getInicio(){
		return inicio;
	}
	public int getSize() {
		return size;
	}
	public Boolean esVacia(){
		return size==0;
	}
	public void add(Object dato){
		DNodo newNod=new DNodo(null, String.valueOf(dato), null);
		if(esVacia()==true){
			newNod.setNext(newNod);
			newNod.setPrev(newNod);
			this.inicio=newNod;
		}else if(getSize()==1){
			newNod.setNext(inicio);
			newNod.setPrev(inicio);
			inicio.setNext(newNod);
			inicio.setPrev(newNod);
		}else{
			newNod.setNext(inicio);
			newNod.setPrev(inicio.getPrev());
			inicio.getPrev().setNext(newNod);
			inicio.setPrev(newNod);			
		}
		this.size++;
	}
	public DNodo buscar(Object dato){
		String busqueda=String.valueOf(dato);
		DNodo aux;
		if(esVacia()!=true){
			aux=getInicio();
			for(int i=0;i<getSize();i++){
				if(busqueda.compareToIgnoreCase(aux.getElemento())==0)
					return aux;
				aux=aux.getNext();
			}
		}
		return null;
	}	
	public void remove(Object dato){
		DNodo newNod=buscar(dato),next,prev;
		if(newNod!=null){
			prev=newNod.getPrev();
			next=newNod.getNext();
			prev.setNext(next);
			next.setPrev(prev);
			this.size--;
		}
	}
	public void remove(){
		DNodo prev,next;
		if(esVacia()!=true){
			if(getSize()==1){
				this.inicio=new DNodo(null, null, null);
			}
			else if(getSize()>1){
				prev=getInicio().getPrev();
				prev=prev.getPrev();
				prev.setNext(inicio);
				inicio.setPrev(prev);
			}
			this.size--;
		}
	}
	public void insertar(Object dato,int x){
		DNodo nodo= new DNodo(null, String.valueOf(dato), null),aux,prev;
		if(esVacia()!=true){
			if(x==0||x>=getSize())
				add(nodo);
			else{
				aux=getInicio().getNext();
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
		this.inicio=new DNodo(null, null, null);
		this.size=0;
	}
	@Override
	public String toString() {
		String prin="";
		DNodo newNod=getInicio();
		for(int i =0;i<getSize();i++){
			prin+=newNod.getElemento()+"\n";
			newNod=newNod.getNext();
		}
		return prin;
	}
	public String toString1() {
		String prin="";
		DNodo newNod=getInicio().getPrev();
		for(int i =0;i<getSize();i++){
			prin+=newNod.getElemento()+"\n";
			newNod=newNod.getPrev();
		}
		return prin;
	}	
}
