package Turma24;

public class Pregui�a extends Animal {

	private String estado;
	private String pa�s;
	private int identificacao;


	public Pregui�a (String nome, int idade, String sexo, String estado, String pa�s, int identificacao) 
	{
		super(nome, idade, sexo);
		this.estado = estado;
		this.pa�s=pa�s;
		this.identificacao = identificacao;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cachorro: "+getNome()+"\nIdade: "+getIdade()+
				"\nSexo: "+getSexo()+"\nEstado do Animal: "+estado+"\nPa�s de Origem: "+
				pa�s+"\nN�mero de Identifica��o: "+identificacao);
		
	}
}
