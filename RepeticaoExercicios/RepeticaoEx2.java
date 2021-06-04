package Turma24;

import java.util.Scanner;

public class RepeticaoEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y,contadorPar=0,contadorImpar=0;

		Scanner read = new Scanner(System.in);

		
		for (x=1;x<=10;x++) {
			
			System.out.println("Entre com um número:");
			y=read.nextInt();
			
			if (y%2==0) {
			
				contadorPar++;
			}
			
			else {
				
				contadorImpar++;
			}
		
		}
		
		System.out.println("\nQuantidade de números Pares:"+contadorPar);
		System.out.println("\nQuantidade de números Ímpares:"+contadorImpar);
		
	}

}
