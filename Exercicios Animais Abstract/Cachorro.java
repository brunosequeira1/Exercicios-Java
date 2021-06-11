package Turma24;

public class Cachorro extends Animal {
	
	private String tamanho;
	private String cor;

	public Cachorro (String nome, int idade, String sexo, String tamanho, String cor) 
	{
		super(nome, idade, sexo);
		this.tamanho = tamanho;
		this.cor=cor;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cachorro: "+getNome()+"\nIdade: "+getIdade()+
				"\nSexo: "+getSexo()+"\nTamanho: "+tamanho+"\nCor: "+cor);
		
	}
	public void som()
	{
		System.out.println("\nO cachorro faz Au Au... ");
		
	}
	@Override
	public void correr() {

		System.out.println("\nO cachorro n�o corre t�o r�pido...");
	}
	@Override
	 public void subirArvores() {
		System.out.println("\nO cachorro nao sobe em arvores...");
	
	}
	
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}


}
