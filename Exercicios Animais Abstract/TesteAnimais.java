package Turma24;

public class TesteAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cavalo cavalo1 = new Cavalo("Vento", 15, "Macho", "Mustangue", 325);

		cavalo1.imprimirInfo();
		cavalo1.som();
		cavalo1.correr();


		System.out.println();
		
		Cachorro cachorro1 = new Cachorro("Rex", 6, "Macho", "Pequeno","Branco");

		cachorro1.imprimirInfo();
		cachorro1.som();
		cachorro1.correr();

		System.out.println();

		Pregui�a pregui�a1 = new Pregui�a("Ariel", 5, "F�mea", "Saud�vel","Peru",462856);

		pregui�a1.imprimirInfo();
		pregui�a1.som();		
		pregui�a1.subirArvores();


		System.out.println();

	}

}
