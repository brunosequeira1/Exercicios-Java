package Turma24;

import java.util.Scanner;

public class RepeticaoEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade=0,contMenor=0,contMaior=0;
		
		Scanner read = new Scanner(System.in);

		System.out.println("Entre com uma idade:");

		idade=read.nextInt();
		

		
		while (idade!=-99) {


			if (idade<21) {
				contMenor++;
				System.out.println("\nEntre com outra idade:");
				idade=read.nextInt();

			}
		
			else if (idade>50) {
				contMaior++;
				System.out.println("\nEntre com outra idade:");
				idade=read.nextInt();

			}
			else {
				
				System.out.println("\nEntre com outra idade:");
				idade=read.nextInt();
			}
		}
		
		System.out.println("\nTotal de pessoas com menos de 21 anos:"+contMenor);
		System.out.println("\ntotal de pessoas com mais de 50 anos:"+contMaior);
	}

}
