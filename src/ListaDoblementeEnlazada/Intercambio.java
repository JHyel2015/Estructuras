package ListaDoblementeEnlazada;

import java.util.Arrays;

public class Intercambio {
	private int[] arrNumeros,arrBurbuja;

	public Intercambio() {
		System.out.println("Metodo de ordenación por intercambio\nEjemplo:"+
				"Presentamos el arreglo a ordenar");
		arrNumeros = new int[]{8,4,6,2,1,10};
		arrBurbuja = new int[]{8,4,6,2,1,10};
		System.out.println(Arrays.toString(arrNumeros));
		metodoIntercambio(arrNumeros);
		//metodoBurbuja(arrBurbuja);
		System.out.println("\nAhora el arreglo ordenado:\n"+Arrays.toString(arrNumeros));
	}
	public void metodoIntercambio(int[] array){
		int numComp=0,numInter=0;
		for(int i=0;i<array.length-1;i++){
			System.out.println("\nPasada: "+(i+1)+"\n");
			for(int j=i+1;j<array.length;j++){
				if(array[j]<array[i]){
					intercambiar(arrNumeros, i, j);
					numInter++;
					System.out.print(array[j]+" es mayor que "+array[i]+"\n"+
							array[i]+" pasa a la posicion "+i+" ("+array[j]+")\n");
				}else{
					System.out.print(array[i]+" No es mayor que "+array[j]+
							"\nNo se hace nada\n");
				}
				System.out.println(Arrays.toString(array)+"\n");
				numComp++;
			}
		}
		System.out.println("Comparaciones\tIntercambios\n"+numComp+"\t\t"+numInter);
	}
	public void metodoBurbuja(int[] array){
		int numComp=0,numInter=0;
		for(int i=0; i<array.length-1;i++){
			for(int j=0; j < array.length-1; j++){          
				if(array[j] > array[j+1]){         
					intercambiar(array, j, j+1); 
					numInter++;
				} 
				numComp++;
			}
		}
		System.out.println("Comparaciones\tIntercambios\n"+numComp+"\t\t"+numInter);
	}
	public void intercambiar(int[] array,int i,int j){
		int aux;
		aux=array[i];
		array[i]=array[j];
		array[j]=aux;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Intercambio app= new Intercambio();
	}

}
