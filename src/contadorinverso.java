import java.util.Scanner;

public class contadorinverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroInicial = 1200;
		while (numeroInicial >= 620) {
			System.out.print(numeroInicial + " ");
			numeroInicial = numeroInicial - 20;
		}
		System.out.println();
		for (int numero = 1200; numero >= 620; numero = numero - 20) {
			System.out.print(numero + " ");
		}
		System.out.println();
		numeroInicial = 1200;
		do {
			System.out.print(numeroInicial + " ");
			numeroInicial = numeroInicial - 20;
		} while (numeroInicial >= 620);
		System.out.println();
		// vamos a pedir ahora nuevas cosas

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el max: ");
		int variableMax = teclado.nextInt();
		
		int variableMin;
		do {
			System.out.print("Introduzca el mim: ");
			variableMin = teclado.nextInt();
		} while (variableMax<variableMin);
		
		
		
		System.out.print("Introduzca el Salto: ");
		int salto = teclado.nextInt();
		
		do {
			variableMax=variableMax - salto;
			System.out.println(variableMax+" ");
			}while(variableMax>variableMin);
	teclado.close();
	}
}