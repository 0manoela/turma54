package oplogicos;

import java.util.Scanner;

public class mesesdiasanos {
	


		public static void main(String[] args) {
			
			int ano, mes, idade, meses, dias;
			
			ano = 365;
			mes = 30;
			
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			dias = idade * ano;
			meses = idade * ano / mes;
			
			System.out.println("Você tem " + idade + " anos...");
			System.out.println("Sua idade em meses é de, " + meses + " meses!!!");
			System.out.println("Sua idade em dias é de, " + dias + " dias!!!");
			
			
			
					

		}

}

