package practicas;

public class elementos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]cadenaInicial= new String [10];
		for (int i=0;i<10;i++) {
			cadenaInicial[i]="hola";
			
		}
		ListaFijadeCadenas cadena1;
		cadena1=new ListaFijadeCadenas(10,cadenaInicial);
		System.out.println(cadena1.getNumeroDeElementos());
		for(int i =0;i<cadena1.getNumeroDeElementos();i++) {
			System.out.println(cadena1.getArray()[i]);
			
		}
	}

}

class ListaFijadeCadenas {// atributos:
	// numero de elemntos
	// array de strings
	// MAXNUM de elementos
	// metodos:
	// setter y getter de cada atributo
	// constructor cin parametrosa de todso sus atributos.

	private int numeroDeElementos;
	private String[] array = new String[MAXNUM];
	private final static int MAXNUM = 10;
	
	

	public ListaFijadeCadenas(int numeroDeElementos, String[] array) {
		this.numeroDeElementos = numeroDeElementos;
		this.array=array;
	}

	public int getNumeroDeElementos() {
		return numeroDeElementos;
	}

	public void setNumeroDeElementos(int numeroDeElementos) {
		this.numeroDeElementos = numeroDeElementos;
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public static int getMaxnum() {
		return MAXNUM;
	}

}
