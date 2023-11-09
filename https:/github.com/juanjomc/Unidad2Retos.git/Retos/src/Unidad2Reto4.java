//Escribe un programa en Java que pida al usuario 3 números y un orden de ordenamiento, que puede ser ascendente o descendente, a continuación, 
//según el orden indicado se mostrarán en pantalla dichos números. Ej.: si los números introducidos son 4,7,2 y se escoge orden ascendente 
//(de menor a mayor) aparecen en pantalla en este orden 2,4,7, 
//si el ordenamiento es descendente (de mayor a menor) se mostrarán en el siguiente 7, 4, 2. Utiliza estructuras de control adecuadas.  


import java.util.Scanner;

public class Unidad2Reto4 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3,comodin, opcion;
					
		
		System.out.println("Introduzca el primer numero");
		num1=sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		num2 = sc.nextInt();
		System.out.println("Introduzca el tercer numero");
		num3 = sc.nextInt();
		System.out.println("Elija la ordenamiento Ascendente 1 o Descendente 2");
		opcion = sc.nextInt();
		
		System.out.println("Ha introducido los numero asi:" + num1 + num2 + num3);
		
		
//Para hacer este reto hay que jugar con 4 variables y hacer condicionales con toda la casuistica.
//Guardando siempre en num1 el menos, en num2 el valor intermedio y en num3 el mayor.

		if (num1<num2 && num1<num3 && num2>num3) {
//			Orden 1,3,2 
			comodin = num2;
			num2 = num3;
			num3 = comodin;
			
		} else if(num1>num2 && num1>num3 && num2>num3){
//			Orden 3,2,1
			comodin=num1;
			num1=num3;
			num3=comodin;

		} else if (num1>num2 && num1<num3 && num2<num3) {
//			Orden 2,1,3
			comodin=num2;
			num2=num1;
			num1=comodin;
			
		} else if (num1<num2 && num1>num3 && num3<num2) {
//			Orden 2,3,1
			comodin = num2;
			num2=num1;
			num1=num3;
			num3=comodin;
					
		} else if (num1>num2 && num1>num3 && num3>num2) {
//			Orden 3,1,2
			comodin=num1;
			num1=num2;
			num2=num3;
			num3=comodin;
			
		}
		
		if (opcion==1) {
			System.out.println("En orden Ascendente quedaria asi\n" + num1 + num2 + num3);
			
		} else {
			System.out.println("En orden Descendete quedaria asi\n" + num3 + num2 + num1);
		}
		
		sc.close();

	}

}