package Turma24;

import java.util.Scanner;

public class exercicioArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int y=6; // final quer dizer que é uma constante
		int [] A = new int [y];
		int soma;
		
		Scanner leia = new Scanner (System.in);
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		
		soma = A[0]+A[1]+A[5];
		System.out.println("Valor da soma A[0], A[1] e A[5]: "+soma);

		A[4] = 100;
		
		System.out.println("\nValor de A[0]: "+A[0]+"\nValor de A[1]: "+A[1]+"\nValor de A[2]: "+A[2]+"\nValor de A[3]: "+A[3]+"\nValor de A[4]: "+A[4]+"\nValor de A[5]: "+A[5]);

		
	}

}
