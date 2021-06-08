package Turma24;

import java.util.Scanner;

public class ExercicioArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] vetor = new int [6];
		int somapar=0, contaimpar=0,x;
		
		Scanner read = new Scanner(System.in);
		
		for (x=0;x<6;x++) {
			
			System.out.println("\nEntre com um número: ");
			vetor [x] = read.nextInt();
			
			if (vetor[x] % 2 == 0) {
				
				somapar = somapar + vetor[x];	
			}
			
			else {
				
				contaimpar ++;
			}
		}
		
		for (x=0;x<6;x++) {
			
			if (vetor[x] % 2 != 0) {
			
				System.out.println("\n"+vetor[x]+" é Impar.");		
		}
		
			else {
			
				System.out.println("\n"+vetor[x]+" é Par.");
			}
		}
		
		System.out.println("\nSoma números pares: " + somapar);
		System.out.println("\nContador de números ímpares: " + contaimpar);	
	}

}
