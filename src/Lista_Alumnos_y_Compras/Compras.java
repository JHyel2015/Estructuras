package Lista_Alumnos_y_Compras;

public class Compras {
	private String nombre;
	private int cantidad;
	private boolean listo;

	public Compras() {
		// TODO Auto-generated constructor stub
		this.nombre=null;
		this.cantidad=0;
		this.listo=false;
	}

	public Compras(int cantidad,String nombre, String estaListo) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		if(estaListo.compareToIgnoreCase("listo")==0&&getCantidad()!=0)
			this.listo = true;
		else
			this.listo=false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isListo() {
		return listo;
	}

	public void setListo(boolean listo) {
		this.listo = listo;
	}

	@Override
	public String toString() {
		String strPrin;
		strPrin = cantidad+"\t"+nombre + "\t";
		if(isListo()==true)
			strPrin+="Listo";
		else
			strPrin+="No";
		return strPrin;
	}

}
