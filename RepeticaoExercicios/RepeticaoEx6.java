package Turma24;

import java.util.Scanner;

public class RepeticaoEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,cont=0,soma=0;
		float media=0;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("\nEntre com um número:\nPara sair digite ZERO(0).");
		x = read.nextInt();

		do
		{
			
			if (x!=0)
			{
			
				if (x%3==0)
				{
				
					soma=soma +x;
					cont++;
				}
			}
			
			System.out.println("\nEntre com um número:\nPara sair digite ZERO(0).");
			x = read.nextInt();
		}
		
		
		while (x!=0);	
		
		media = soma /cont;
		
		System.out.printf("\nMédia dos números múltiplos de 3: %.2f",media);


	}

}
