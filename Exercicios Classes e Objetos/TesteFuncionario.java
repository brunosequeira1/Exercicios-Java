package Turma24;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n------DADOS DO FUNCION�RIO------");
		Funcionario funcionario1 = new Funcionario ("Bruno","Masculino",
				"bruno_silth@hotmail.com","Gerente",30,9,4800);
		
		//troca de mensagens(chamada ao m�todo apresentarInfo())
		funcionario1.apresentarInfo();
	}

}
