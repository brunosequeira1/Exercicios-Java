package Turma24;

import java.text.NumberFormat;

public class Funcionario {

	private String nome;
	private String sexo;
	private String email;
	private String cargo;
	private int idade;
	private int cargaHoraria;
	private int salario;
	
				
	//método especial CONSTRUTOR
	public Funcionario (String nome,String sexo,String email, String cargo,
			int idade, int cargaHoraria, int salario)
	{
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.cargo = cargo;
		this.idade = idade;
		this.cargaHoraria = cargaHoraria;
		this.salario = salario;
	
	}
	
	//declaração dos demais métodos da classe
	public void apresentarInfo()
	{
		System.out.println("\nNOME: "+nome+"\nSexo: "+sexo+"\nEmail: "+email+"\nCargo: "
					+cargo+ "\nIdade: "+idade+" anos"+"\nCarga Horária: "+cargaHoraria+" horas por dia"+"\nSalário: "+this.formatarMoeda());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
}
