package lacos;

	
	import java.util.Scanner;
	
	public class categoria {
		
		public static void main(String[]args) {
			
			Scanner valor = new Scanner(System.in);
			
			System.out.println("Digite sua idade para saber em qual categoria se encaixa: ");
			
			int idade = valor.nextInt();
			
			if(idade >= 10 && idade <= 14) {
				System.out.println("Sua categoria: INFANTIL");
			}
			else if(idade >= 15 && idade <= 17) {
				System.out.println("Sua categoria: JUVENIL");
			}
			else if(idade >= 18 && idade <= 25) {
				System.out.println("Sua categoria: ADULTO");
			}
			else {
				System.out.println("Idade fora da tabela de categoria! ");
			}
			
		}
		}

	


