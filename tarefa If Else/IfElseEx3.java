package Turma24;

import java.util.Scanner;

public class IfElseEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com a idade em anos: ");
		idade = leia.nextInt();
		
		if (idade>=10 && idade<=14) {
			System.out.println("\nVoc� est� na categoria Infantil.");
		}
		else if (idade>=15 && idade<=17) {
			System.out.println("\nVoc� est� na categoria Juvenil.");
		}
		else if (idade>=18 && idade<=25) {
			System.out.println("\nVoc� est� na categoria Adulto.");
		}
		else {
			System.out.println("\nValor de idade n�o se enquadra em nenhuma das categorias.");
		}
	}

}
