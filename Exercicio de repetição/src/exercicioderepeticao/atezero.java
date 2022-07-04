package exercicioderepeticao;

import java.util.Scanner;

public class atezero {
	
	
public static void main(String[] args) {
		
		System.out.println("  || SOMANDO VALORES ATÉ ACERTAR O NÚMERO QUE PARA O PROGRAMA ||");
		
		int num, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		do {
			System.out.println("Insira um valor: ");
			
			num = leia.nextInt();
			if(num != 0) {
				soma += num;
			}
		}while(num != 0);
		
		System.out.println("A soma dos  valores inseridos é de : "+ soma);
	}


}
