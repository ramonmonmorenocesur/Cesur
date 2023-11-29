import java.util.Scanner;

public class Switch {

	static final int TOTALNUM = 10;
	static int[] arrayEnteros = new int[TOTALNUM];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// solicita 10 numeros y almacena en array de int
		// imprime el array solo los numeros pares
		//
		pideNumeros();
		imprimeNumeros();
		cambiaApar();
		imprimeNumeros();
	}

	static void pideNumeros() {

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < arrayEnteros.length; i++) {
			System.out.println("introduce el numero "+ i);
			
			arrayEnteros[i] = teclado.nextInt();
			
		}
		teclado.close();
	}
	

	static void imprimeNumeros() {
		for (int i = 0; i < arrayEnteros.length; i++) {
			if (arrayEnteros[i] % 2 == 0) {
				System.out.println(arrayEnteros[i]);
			}
		}
	}

	static  void cambiaApar() {
		for(int i=0;i<arrayEnteros.length;i++) {
			if(arrayEnteros[i]%2!=0) {
				arrayEnteros[i]=arrayEnteros[i]+1;
			}
		}
	}
	static void reseteaNumeros() {
		for(int i=0; i<arrayEnteros.length;i++) {
			arrayEnteros[i]=0;
		}
	}
}
