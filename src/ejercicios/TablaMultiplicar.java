package ejercicios;

import java.util.Scanner;

public class TablaMultiplicar {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Dime un número y te digo su tabla de multiplicar");
		int num = entrada.nextInt();
		
		
		
		for (int i = 1; i<=10 ;i++) {
		 int resultado = i * num;
		 System.out.println(num + " x " + i + " = " + resultado);
		 
		}
		
		
		entrada.close();
	}

}
