package Turma24;

import java.util.Scanner;

public class RepeticaoEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade=0,genero,caracteristica,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0,tp=1;
		
		Scanner read = new Scanner(System.in);
		
		while (tp<=5) {
			System.out.println("Entre com uma idade:");
			idade=read.nextInt();
			while (idade<1 || idade>120) {
				System.out.println("\nIdade Inválida.");
				System.out.println("\nEntre com uma idade:");
				idade=read.nextInt();
				
			}
			
			System.out.println("Entre com seu gênero:\n1-Feminino\n2-Masculino\n3-Outros");
			genero=read.nextInt();
			while (genero<1 || genero>3) {
				System.out.println("\nCódigo Inválido.");
				System.out.println("\nEntre com seu gênero:\n1-Feminino\n2-Masculino\n3-Outros");
				genero=read.nextInt();

			}
			
			System.out.println("Entre com uma característica:\n1-Calma\n2-Nervosa\n3-Agressiva");
			caracteristica=read.nextInt();
			while (caracteristica<1 || caracteristica>3) {
				System.out.println("\nCódigo Inválido.");
				System.out.println("Entre com uma característica:\n1-Calma\n2-Nervosa\n3-Agressiva");
				caracteristica=read.nextInt();
			}
			if (caracteristica == 1) {
				contpc++;
			}
			if (genero==1 && caracteristica==2) {
				contmn++;
				
			}
			if (genero==2 && caracteristica==3) {
				contha++;
			}
			if (genero==3 && caracteristica==1) {
				contoc++;
			}
			if (caracteristica==2 && idade>40) {
				contpn40++;
			}
			if (caracteristica==1 && idade<18) {
				contpc18++;
			}
			
			tp++;
			
		}
		
		System.out.println("\nPessoas Calmas:"+contpc);
		System.out.println("\nMulheres Nervosas:"+contmn);
		System.out.println("\nHomens Agressivos:"+contha);
		System.out.println("\nOutros Calmas:"+contoc);
		System.out.println("\nPessoas Nervosas com mais de 40 anos:"+contpn40);
		System.out.println("\nPessoas Calmos com menos de 18 anos:"+contpc18);

	}

}
