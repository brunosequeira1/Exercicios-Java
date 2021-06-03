package Turma24;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double A, B, C, R, S, D;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com o valor de A: ");
		A = leia.nextDouble();
		System.out.println("\nEntre com o valor de B: ");
		B = leia.nextDouble();
		System.out.println("\nEntre com o valor de C: ");
		C = leia.nextDouble();
		
		R = Math.pow((A+B),2.0);
		// escreva("\nR: ", R)
	
		S = Math.pow((B+C),2.0);
		// escreva("\nS: ", S)

		D = (R+S)/2;
		System.out.println("\nO valor de D é: "+ D);
	}

}
