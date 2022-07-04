package VETORMATRIZ;

import java.util.Random;

public class MATRIZ {

		public static void main(String[] args) throws InterruptedException {
			
			int[][] matriz = new int[3][3];
			int soma=0, somaDiagonal=0;
			Random random = new Random();
			for(int i=0; i < matriz.length; i++) {
				for(int j=0; j < matriz[i].length; j++) {
					matriz[i][j] = random.nextInt(100);
					soma += matriz[i][j];
					if(i == j) {
						somaDiagonal += matriz[i][j];
					}
				}
			}
			System.out.println("=======MATRIZ PREENCHIDA=======");
			for(int i=0; i < matriz.length; i++) {
				for(int j=0; j < matriz[i].length; j++) {
					System.out.printf(matriz[i][j]+" | ");
					Thread.sleep(500);
				}
				System.out.println();
			}
			System.out.println("A soma de todos os valores: "+ soma);
			Thread.sleep(500);
			System.out.println("A soma dos valores na dagonal: "+ somaDiagonal);
		}

	}
