package ejercicios;

import java.util.Scanner;

public class PArOImpar {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		
		System.out.println("Dime un número y te digo si es par o impar");
		int num = escaner.nextInt();
		
		escaner.close();
		
		if (num % 2 == 0) {
			System.out.print("El número: " + num + " es par");
		} else {
			System.out.print("El número: " + num + " es impar");
		}
		
	}
	
}
