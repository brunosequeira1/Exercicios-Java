package Turma24;

public class Animal {

	// declaração dos atributos(variáveis de instância) da classe

	private String nome;
	private int idade;
	private String sexo;

	// método especial CONSTRUTOR
	public Animal(String nome, int idade, String sexo) {
		
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;

	}

	// declaração dos demais métodos da classe
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
