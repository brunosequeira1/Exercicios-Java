package Turma24;

import java.util.Scanner;

public class Inicio extends Perfil {

	Scanner read = new Scanner(System.in);
	
	
	public Inicio (String email, String login, String senha)
	
	{
		super(email,login,senha);
	
	}
	
	public void IniciarSessao()
	{

				
		System.out.println("\n\n-----INICIAR SESSÃO-----");
        System.out.print("\n\nLogin ou Email: ");
        String x = read.next();
        
        System.out.print("\nSenha: ");
        String y = read.next();

        while((!getLogin().equals(x) || !getSenha().equals(y)) && (!getEmail().equals(x) || !getSenha().equals(y)))
        {
            System.out.println("Combinação inválida! ");
            System.out.printf("\nLogin ou Email: ");
            x = read.next();
            System.out.printf("\nSenha: \n");
            y = read.next();
         }
        
        
        System.out.println(""
        		+ ".______     ______         ___           _______.    ____    ____   __  .__   __.  _______        ___            _______.\r\n"
        		+ "|   _  \\  /  __  \\      /   \\        /       |    \\   \\  /  / |  | |  \\ |  | |       \\    /   \\         /       |\r\n"
        		+ "|  |_)  | |  |  |  |     /  ^  \\       |   (----`    \\   \\/  /  |  | |   \\|  | |  .--.  |   /  ^  \\       |   (----`\r\n"
        		+ "|   _  <  |  |  |  |    /  /_\\ \\      \\   \\        \\      /   |  | |  . `   | |  |  |  |  /  /_\\  \\     \\   \\    \r\n"
        		+ "|  |_)  | |  `--'  |   /  _____  \\  .----)   |         \\    /    |  | |  |\\   | |  '--'  | /  _____  \\  .----)   |   \r\n"
        		+ "|______/  \\______/   /__/     \\_\\ |_______/           \\__/     |__| |__| \\__| |_______/ /__/     \\__\\ |_______/    \r\n"
        		+ "                                                                                                                    ");
        
	}
	
}
