package oplogicos;

import java.util.Scanner;

public class media {
	

		
		public static void main(String[] arg) {
			
			Scanner nota = new Scanner(System.in);
			
			System.out.println("Insira as 3 notas do semestre para saber sua m�dia: \n- 1� Nota: ");
			double nota1 = nota.nextDouble();
			
			System.out.println("- 2� Nota: ");
			double nota2 = nota.nextDouble();
			
			System.out.println("- 3� Nota: ");
			double nota3 = nota.nextDouble();
			
			double media = (nota1 + nota2 + nota3) / 3;
			
			System.out.println("Sua m�dia final ser� de: "+ media);
			}

	}

