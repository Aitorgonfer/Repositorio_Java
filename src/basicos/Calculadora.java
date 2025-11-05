package basicos;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1;
		int n2;
		System.out.print("Dime un primer número: ");
		
		n1 = entrada.nextInt();
		
		System.out.print("Dime un segundo número: ");
		
		n2 = entrada.nextInt();
		
		double resultadoSuma = n1 + n2;
		double resultadoResta = n1 - n2;
		double resultadoMultiplicacion = n1 * n2;
		double resultadoDivision = n1 / n2;
		
		if (n2 != 0) {
            resultadoDivision = n1 / n2;
        } else {
            resultadoDivision = Double.NaN; 
        }
		System.out.print("La suma es: " + resultadoSuma);
		
		System.out.print("La resta es: " + resultadoResta);
		
		System.out.print("La multiplicación es: " + resultadoMultiplicacion);
		
		System.out.print("La división es: " + resultadoDivision);
		
		entrada.close();
	}
	
}
