package Turma24;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idadeEmDias, anos, meses, dias;

		Scanner leia = new Scanner(System.in);
					
		 System.out.println ("\nQual sua idade?"); // apenas texto para introdução		 
		 System.out.println ("\nEntre com anos: ");
		 anos = leia.nextInt();
		 System.out.println ("\nEntre com meses : ");
		 meses = leia.nextInt();
		 System.out.println ("\nEntre com a dias: ");
		 dias = leia.nextInt();

		idadeEmDias = anos*365+meses*30+dias;

			System.out.println("\nA A idade total em dias é de: "+idadeEmDias);

	}

}
