//Escribe un programa en Java que muestre y cuente los números que son múltiplos de 2 o de 3 que hay entre 1 y 100. 
//Utiliza las estructuras de control que creas convenientes.

import java.util.Scanner;


public class Unidad2Reto3 {

	public static void main(String[] args) {

		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		
//Creamos un do-while que no saldra hasta que pulse la opcion 2 o 3.
		
		do {
			
			System.out.println("Que desea ver multiplos de 2 o de 3, elija la opcion: \n2==>Multiplos del 2 \n3==> Multiplos del 3");
			opcion = sc.nextInt();
			

			if (opcion!=3 || opcion!=2) {
				System.out.println("Opcion incorrecta\n");
			}
			
		}
		while (opcion != 2 && opcion != 3);
		
//Hacemos un bucle for hasta 100, empezando en el numero que hemos indicado e incrementandolo en el bucle con el mismo numero, para asi tener los multiplos.
		
		for (int i = opcion; i < 100; i=i+opcion) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
