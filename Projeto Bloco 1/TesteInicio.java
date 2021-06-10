package Turma24;

public class TesteInicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inicio teste1 = new Inicio ("zinha@1.com","zinha","abc");
		
		
		
		System.out.println(teste1.getLogin());
		System.out.println(teste1.getSenha());

		teste1.IniciarSessao();
		

	}

}
