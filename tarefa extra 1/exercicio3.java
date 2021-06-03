package Turma24;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tempototalsegundos, horas, minutos, segundos;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com o total de tempo em segundos: ");
		tempototalsegundos = leia.nextInt();
		
		horas = tempototalsegundos/3600;
		System.out.println("\nHoras: "+ horas);

		minutos = (tempototalsegundos%3600)/60; 
		System.out.println("\nMinutos: "+ minutos);

		segundos = (tempototalsegundos%3600)%60;
		System.out.println("\nSegundos: "+ segundos);
		
	}

}
