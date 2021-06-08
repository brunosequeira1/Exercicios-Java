package Turma24;

import java.util.Scanner;

public class exercicioArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [][] matriz1 = new double [2][2];
		double [][] matriz2 = new double [2][2];
		double [][] matriz3 = new double [2][2];
		final double constante=5;
		int opcao;
		
		Scanner read = new Scanner (System.in);

		
		for (int l=0;l<2;l++) {
			
			for (int c=0;c<2;c++) {
				
				System.out.println("\nEntre com um valor da primeira matriz:");
				matriz1[l][c]=read.nextDouble();
				
				System.out.println("\nEntre com um valor da segunda matriz:");
				matriz2[l][c]=read.nextDouble();
			}
		}
	
		System.out.println("\nMenu:");
		System.out.println("\n1-Soma:");
		System.out.println("\n2-Subtração:");
		System.out.println("\n3-Adição de constante:");
		System.out.println("\n4-Exibir as matrizes:");
		System.out.println("\nDigite a opção: ");
		opcao = read.nextInt();
		
		/*while (op<1 || op>4) {
			
			System.out.println("\nOpção inválida.");
			System.out.println("\nMenu:");
			System.out.println("\n1-Soma:");
			System.out.println("\n2-Subtração:");
			System.out.println("\n3-Adição de constante:");
			System.out.println("\n4-Exibir as matrizes:");
			System.out.println("\nDigite a opção: ");
		}
		*/
			
		switch (opcao) {
			case 1: 
			
				for (int l=0;l<2;l++) {	
					
					for (int c=0;c<2;c++) {
					
					matriz3[l][c]= matriz1[l][c] + matriz2[l][c];
					System.out.println("\nSoma: "+matriz3[l][c]);	
				}
			}
			
			break;

			case 2: 
				
				for (int l=0;l<2;l++) {	
				
					for (int c=0;c<2;c++) {
						
						matriz3[l][c]= matriz2[l][c] - matriz1[l][c];
						System.out.println("\nSubtração: "+matriz3[l][c]);
												
					}
				}	
				
			break;
				
			case 3: 
					
				for (int l=0;l<2;l++) {	
					
					for (int c=0;c<2;c++) {
						
						System.out.println("\nO valor da constante é: "+constante);
						
						matriz1[l][c]= matriz1[l][c] + constante;
						matriz2[l][c]= matriz2[l][c] + constante;
							
						System.out.println("\nAdição na Matriz1: "+matriz1[l][c]);
						System.out.println("\nAdição na Matriz2: "+matriz2[l][c]);
							
					}
				}
					
			break;
				
			case 4: 
						
				for (int l=0;l<2;l++) {	
					for (int c=0;c<2;c++) {
						System.out.println("\nExibir Matriz1: "+matriz1[l][c]);
						System.out.println("\nExibir Matriz2: "+matriz2[l][c]);
					}
				}
			
			break;
			
			default:
				
				System.out.println("\nOpção inválida.");
		}
	}
}
