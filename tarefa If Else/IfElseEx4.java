package Turma24;

import java.util.Scanner;

public class IfElseEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		double aux;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com o n�mero: ");
		x = leia.nextInt();
		
		if (x%2==0 && x!=0.0) 
		{

			aux=Math.sqrt(x);
			
			System.out.println("\nN�mero Par e sua raiz quadrada �: "+aux);
		}
			
		else if (x%2!=0)
		{
			aux=Math.pow(x,2);
			
			System.out.println("\nN�mero �mpar e seu quadrado �: "+aux);
		}
			
		else 
		{ 
			System.out.println("\nO n�mero inserido � o 0.");
		}
				
				
			
	}

}
