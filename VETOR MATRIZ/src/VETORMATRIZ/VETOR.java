package VETORMATRIZ;

import java.util.Scanner;

public class VETOR {
	


		public static void main(String[] args) {
			
			
			double[] vetor = new double[5];
			double maior=0;
			 
			
			for(int i = 0; i < vetor.length; i++ ) {
				System.out.println("Informe um valor: ");
				vetor[i] = new Scanner(System.in).nextDouble();
				if(vetor[i] > maior) {
					maior = vetor[i];
				}
			}
			System.out.println("A maior pontuação foi: "+ maior);
			
		}

	}

