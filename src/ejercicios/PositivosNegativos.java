package ejercicios;

import java.util.Scanner;

public class PositivosNegativos {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime cuantos números me vas a dar: ");
		int num;
		int numeros = scan.nextInt();
		
		int positivos=0;
		int negativos=0;
		int ceros=0;
		
		
		
		for (int i = 1; i<=numeros ;i++) {
			System.out.println("Dime el número: " + i );
			num = scan.nextInt();
			
			if (num>0) {
				positivos++;
			}else if (num<0) {
				negativos++;
			}else {
				ceros++;
			}
			
		}
		
		System.out.println("En total han sido: "
		+ positivos + " números positivos " 
		+ negativos + " números negativos y " 
		+ ceros + " números 0");
		
		
		scan.close();
		
	}

}
