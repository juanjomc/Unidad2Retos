//Escribe un programa en Java que pida un número por teclado hasta que éste sea positivo. 
//A continuación, muestra los primeros 20 números sucesivos a dicho número.

import java.util.Scanner;

public class Unidad2Reto2 {

	public static void main(String[] args) {

		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero positivo y le decimos los 20 siguientes:");

		do {
		
			numero = sc.nextInt();
			
			if (numero<0) {
				System.out.println("El numero debe de ser positivo, vuelva a intentarlo.");
				
			} else {
				System.out.println("Este numero esta bien, te muestro los siguientes 20\n");

			}
			
			
		} while (numero<0);
		
//El bucle empieza en numero + 1, que es el siguiente y termina mostrando los siguientes 20 numeros hasta que i alcance dicho numero + 21
		
		for (int i = numero+1; i < numero+21; i++) {
			
			System.out.println(i);
		}
		
		sc.close();
	
	}

}