package Turma24;

public class ProdutoEletronico {
	
	//declaração dos atributos(variáveis de instância) da classe
	
		private String nomeProduto;
		private String marca;
		private String modelo;
		private String estado;
		private int preco;
		private int codigo;
		
		//método especial CONSTRUTOR
		public ProdutoEletronico (String nome,String marca,String modelo,String estadoUso, int preco, int codigo)
		{
			this.setNome (nome);
			this.marca = marca;
			this.modelo = modelo;
			this.setEstado (estadoUso);
			this.preco = preco;
			this.codigo = codigo;
			
		}
		
		public void setNome(String nome) 
		{
			nomeProduto = nome;
			
		}	
		public void setEstado (String estadoUso) 
		{
			estado = estadoUso;
			
		}	
		//declaração dos demais métodos da classe
		public void apresentarInfo()
		{
			System.out.println("Produto Eletrônico = "+nomeProduto+"\nMarca =  "+marca+"\nModelo = "+modelo
					+"\nEstado de Uso =  "+estado+"\nPreço = "+preco+"\nCódigo = "+codigo);
		}

		public String getNomeProduto() {
			return nomeProduto;
		}

		public void setNomeProduto(String nomeProduto) {
			this.nomeProduto = nomeProduto;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getPreco() {
			return preco;
		}

		public void setPreco(int preco) {
			this.preco = preco;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getEstado() {
			return estado;
		}

	
	
}
