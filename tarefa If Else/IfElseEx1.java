package Turma24;

import java.util.Scanner;

public class IfElseEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,num3;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("\nEntre com um valor: ");
		num1 = ler.nextInt();
		
		System.out.println("\nEntre com um valor: ");
		num2 = ler.nextInt();
		
		System.out.println("\nEntre com um valor: ");
		num3 = ler.nextInt();
		
		if (num1>num2)
		{	
			num2=num1;
			
			if (num1>num3)
			{
				System.out.println("\nO maior número é:"+num1);
			}
		
			else
			{
				System.out.println("\nO maior número é:"+num3);
			}
		}
			
		else if (num2>num1)
		{	
			num1=num2;
			
			if (num2>num3)
			{
				System.out.println("\nO maior número é:"+num2);
			}
			else 
			{
				System.out.println("\nO maior número é:"+num3);
			}
		}
		
		else
		{	
			System.out.println("\nO maior número é:"+num3);
		}
	}

}
