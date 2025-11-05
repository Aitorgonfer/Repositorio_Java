package ejercicios;

import java.util.Scanner;

public class DiaSemana {
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	int num1;
	
	System.out.print("Escribe un numero");
	num1 = entrada.nextInt();
	
	int opcion = num1;
	
	switch (opcion) {	
	case 1 :
		System.out.println("Hoy es lunes");
		break;
	case 2 :
		System.out.println("Hoy es martes");
		break;
	case 3 :
		System.out.println("Hoy es miércoles");
		break;
	case 4 :
		System.out.println("Hoy es jueves");
		break;
	case 5 :
		System.out.println("Hoy es viernes");
		break;
	case 6 :
		System.out.println("Hoy es sábado");
		break;
	case 7 :
		System.out.println("Hoy es domingo");	
		break;
	default :
		System.out.println("Te has equivocado introduce un numero del 1 al 7");
		
	}
	
	entrada.close();
	
	}
}
