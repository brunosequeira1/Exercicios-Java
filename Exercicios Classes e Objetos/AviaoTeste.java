package Turma24;

public class AviaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciando um objeto da classe 
				System.out.println("\n*****Informativo de Avi�o*****");
				Aviao aviao1 = new Aviao ("GOL","Boeing 737","comercial",320,830);
				
				//troca de mensagens(chamada ao m�todo apresentarInfo())
				aviao1.apresentarInfo();
				
				System.out.println("\n*****Transfer�ncia de Companhia*****");
				aviao1.setCompanhia("AZUL");
				aviao1.apresentarInfo();
				
				System.out.println("\n*****Aquisi��o de novo Avi�o*****");
				Aviao aviao2 = new Aviao ("GOL","Boeing 787","carga",20,790);
				aviao2.apresentarInfo();


				

				
				/*System.out.println("\n*****Transfer�ncia de Proprietaria(o)*****");
				auto1.setNomeProprietario("Bruno Constantino");
				auto1.imprimirInfo();
				
				Automovel auto2 = new Automovel("Denise Mignoli","Toyota","KY85",2021);
				auto2.imprimirInfo();
				System.out.println("\n*****Mudan�a de Placa*****");
				auto2.setPlaca("AC27");
				auto2.imprimirInfo();
				*/
		
	}

}
