package Turma24;

public abstract class Animal {

	// declara��o dos atributos(vari�veis de inst�ncia) da classe

	private String nome;
	private int idade;
	private String sexo;

	// m�todo especial CONSTRUTOR
	public Animal(String nome, int idade, String sexo) {
		
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;

	}

	// declara��o dos demais m�todos da classe
	
	abstract public void som();
	abstract public void correr();
	abstract public void subirArvores();
	
	public void apresentarInfo() {
		System.out.println("Nome do Animal: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
