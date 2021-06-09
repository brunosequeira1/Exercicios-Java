package Turma24;

public class TesteAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cavalo cavalo1 = new Cavalo("Vento", 15, "Macho", "Mustangue", 325);

		cavalo1.imprimirInfo();
		
		System.out.println();
		
		Cachorro cachorro1 = new Cachorro("Rex", 6, "Macho", "Pequeno","Branco");

		cachorro1.imprimirInfo();
		
		System.out.println();

		Preguiça preguiça1 = new Preguiça("Ariel", 5, "Fêmea", "Saudável","Peru",462856);

		preguiça1.imprimirInfo();

		System.out.println();

	}

}
