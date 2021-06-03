package Turma24;

import java.util.Scanner;

public class IfElseEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		double aux;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com o número: ");
		x = leia.nextInt();
		
		if (x%2==0 && x!=0.0) 
		{

			aux=Math.sqrt(x);
			
			System.out.println("\nNúmero Par e sua raiz quadrada é: "+aux);
		}
			
		else if (x%2!=0)
		{
			aux=Math.pow(x,2);
			
			System.out.println("\nNúmero Ímpar e seu quadrado é: "+aux);
		}
			
		else 
		{ 
			System.out.println("\nO número inserido é o 0.");
		}
				
				
			
	}

}
