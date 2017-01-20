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
		}else{
			newNod.setNext(inicio);
			inicio.setPrev(newNod);
		}
		this.size++;
	}
	public DNodo buscar(Object dato){
		String busqueda=String.valueOf(dato);
		DNodo newNod=new DNodo(null, busqueda, null),aux;
		if(esVacia()==true)
			newNod=null;
		else{
			aux=getInicio();
			for(int i=0;i<getSize();i++){
				if(busqueda.compareToIgnoreCase(aux.getElemento())==0)
					return aux;
			}
			newNod=null;
		}
		return newNod;
	}	
	public void remove(Object dato){
		DNodo newNod=buscar(dato),aux,prev;
		if(getSize()>0 && newNod!=null){
			for(int i=0;i<getSize();i++){
				
			}
		}
	}
}
