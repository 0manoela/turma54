package oplogicos;

import java.util.Scanner;

public class media {
	

		
		public static void main(String[] arg) {
			
			Scanner nota = new Scanner(System.in);
			
			System.out.println("Insira as 3 notas do semestre para saber sua média: \n- 1º Nota: ");
			double nota1 = nota.nextDouble();
			
			System.out.println("- 2º Nota: ");
			double nota2 = nota.nextDouble();
			
			System.out.println("- 3º Nota: ");
			double nota3 = nota.nextDouble();
			
			double media = (nota1 + nota2 + nota3) / 3;
			
			System.out.println("Sua média final será de: "+ media);
			}

	}

