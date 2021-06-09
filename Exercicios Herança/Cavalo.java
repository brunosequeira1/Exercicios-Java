package Turma24;

public class Cavalo extends Animal {

	private String raca;
	private int numeroCorrida;

	public Cavalo(String nome, int idade, String sexo, String raca, int numeroCorrida) 
	{
		super(nome, idade, sexo);
		this.raca = raca;
		this.numeroCorrida=numeroCorrida;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cavalo: "+getNome()+"\nIdade: "+getIdade()+
				"\nSexo: "+getSexo()+"\nRaça: "+raca+"\nNúmero de Corrida: "+numeroCorrida);
		
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getNumeroCorrida() {
		return numeroCorrida;
	}

	public void setNumeroCorrida(int numeroCorrida) {
		this.numeroCorrida = numeroCorrida;
	}

	
}
