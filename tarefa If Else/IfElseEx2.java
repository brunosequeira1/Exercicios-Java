package Turma24;

import java.util.Scanner;

public class IfElseEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,num3,aux;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("\nEntre com um valor: ");
		num1 = ler.nextInt();
		
		System.out.println("\nEntre com um valor: ");
		num2 = ler.nextInt();
		
		System.out.println("\nEntre com um valor: ");
		num3 = ler.nextInt();
		

		if (num1>num2)
		{	
			aux=num1;
			num1=num2;
			num2=aux;
		}	
		if (num1>num3)
		{	
			aux=num1;
			num1=num3;
			num3=aux;
		}
		if (num2>num3)
		{	
			aux=num2;
			num2=num3;
			num3=aux;
		}
	
		System.out.println("\nOrdem crescente: "+num1+","+num2+","+num3);

	}	

}


