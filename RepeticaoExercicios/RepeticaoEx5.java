package Turma24;

import java.util.Scanner;

public class RepeticaoEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,soma=0;
		
		Scanner read = new Scanner (System.in);
		
		do
		{
			System.out.println("\nEntre com um número:");
			x = read.nextInt();

			soma = soma +x;
			
		}
		while (x!=0);	
		System.out.println("Soma dos Números Digitados: "+soma);

	}

}
