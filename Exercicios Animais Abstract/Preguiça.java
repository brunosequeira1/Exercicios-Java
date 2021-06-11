package Turma24;

public class Preguiça extends Animal {

	private String estado;
	private String país;
	private int identificacao;


	public Preguiça (String nome, int idade, String sexo, String estado, String país, int identificacao) 
	{
		super(nome, idade, sexo);
		this.estado = estado;
		this.país=país;
		this.identificacao = identificacao;
	}
	
	public void som()
	{
		System.out.println("\nA preguiça nem faz mmmmmmmmmmmmm... ");
		
	}
	@Override
	 public void subirArvores() {
		System.out.println("\nA preguiça sobe em arvores!!!! ");
	
	}	
	@Override
	public void correr() {

		System.out.println("\nA preguiça nao consegue correr!");
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cachorro: "+getNome()+"\nIdade: "+getIdade()+
				"\nSexo: "+getSexo()+"\nEstado do Animal: "+estado+"\nPaís de Origem: "+
				país+"\nNúmero de Identificação: "+identificacao);
		
	}
}
