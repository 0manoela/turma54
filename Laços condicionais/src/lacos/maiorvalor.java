package lacos;	

	import java.util.Scanner;
	
	public class maiorvalor {
	

		public static void main(String[] args) {
			
			Scanner valor = new Scanner(System.in);
			
			System.out.println("Digite 3 n�meros inteiros em sequencia: \n1� N�mero: ");
			int numero1 = valor.nextInt();
			
			System.out.println("2� N�mero: ");
			int numero2 = valor.nextInt();
			
			System.out.println("3� N�mero: ");
			int numero3 = valor.nextInt();
			
			int maior = 0;
			
			if(numero1 > numero2) {
				if(numero1 > numero3)
					maior = numero1;
				else
					maior = numero3;
			}
			else {
				if(numero2 > numero3)
					maior = numero2;
				else
					maior = numero3;
			}
			
			System.out.println("O n�mero maior entre os 3 �: " + maior);
			

		}

	}

