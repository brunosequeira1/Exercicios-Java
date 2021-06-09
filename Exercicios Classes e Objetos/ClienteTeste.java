package Turma24;

import java.util.Scanner;

public class ClienteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciando um objeto da classe 
				
		
				Scanner read = new Scanner (System.in);
				
				String nome;
				nome = read.next();
		
				Cliente cliente1 = new Cliente(nome,"Masculino","bruno_silth@hotmail.com","Rua Ezequias Bezerra, 35",395201,952295449,31);
				
				//troca de mensagens(chamada ao método apresentarInfo())
				cliente1.apresentarInfo();
				
				
	}

}
