package Turma24;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dias, meses, anos, idade;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com o total de dias: ");
		dias = leia.nextInt();
		
		anos = dias/365;
		System.out.println("\nAnos: "+ anos);

		meses = (dias%365)/30 ;
		System.out.println("\nMeses: "+ meses);

		dias = (dias%365)%30;
		System.out.println("\nDias: "+ dias);
	}

}
