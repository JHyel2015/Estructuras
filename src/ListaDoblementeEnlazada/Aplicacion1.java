package ListaDoblementeEnlazada;

public class Aplicacion1 {
	private CLista list;
	private DNodo nod;

	public Aplicacion1() {
		// TODO Auto-generated constructor stub
		
		list=new CLista();
		
		list.add(new DNodo(null, "string", null));
		list.add(1000);
		list.add("Jorge");
		
		System.out.println(list.toString()+"\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Aplicacion1 app= new Aplicacion1();
	}

}
