package Turma24;

public class ProdutoEletronicoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n------Informativo de Produto------");
		ProdutoEletronico produto1 = new ProdutoEletronico ("Celular","Samsung","A35","Novo",2800,52784);
		
		//troca de mensagens(chamada ao m�todo apresentarInfo())
		produto1.apresentarInfo();
		
		System.out.println("\n*****Mudan�a de Pre�o*****");
		produto1.setPreco(3100);
		produto1.apresentarInfo();
		
		
	}

}
