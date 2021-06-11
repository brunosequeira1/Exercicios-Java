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
				"\nSexo: "+getSexo()+"\nRa�a: "+raca+"\nN�mero de Corrida: "+numeroCorrida);
		
	}
	@Override
	public void correr() {

		System.out.println("\nO cavalo corre muito r�pido!");
	}
	
	public String getRaca() {
		return raca;
	}
	@Override
	 public void subirArvores() {
		System.out.println("\nO cavalo nao sobe em arvores...");
	
	}

	public void som()
	{
		System.out.println("\nO cavalo faz IHHHHHrrrrr... ");
		
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
