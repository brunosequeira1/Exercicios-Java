package Turma24;

public class Cliente {
	
	//declaração dos atributos(variáveis de instância) da classe
	
		private String nomeCliente;
		private String sexo;
		private String email;
		private String endereco;
		private double cpf;
		private int telefone;
		private int idade;
		
		//método especial CONSTRUTOR
		public Cliente(String nomeCliente,String sexo,String email,String endereco, double cpf, int telefone, int idade)
		{
			this.nomeCliente = nomeCliente;
			this.sexo = sexo;
			this.email = email;
			this.endereco = endereco;
			this.cpf = cpf;
			this.telefone = telefone;
			this.idade = idade;
			
		}
		
		//declaração dos demais métodos da classe
		public void apresentarInfo()
		{
			System.out.println(nomeCliente+" é um cliente de "+idade+" anos, do sexo "+sexo
					+", email "+email+" residência em "+endereco+". Seu CPF é: " +cpf+" e seu "
						+ "telefone de contato "+telefone+".");
		}

		public String getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
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

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public double getCpf() {
			return cpf;
		}

		public void setCpf(double cpf) {
			this.cpf = cpf;
		}

		public int getTelefone() {
			return telefone;
		}

		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		

}
