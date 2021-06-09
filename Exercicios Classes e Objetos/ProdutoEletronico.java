package Turma24;

public class ProdutoEletronico {
	
	//declara��o dos atributos(vari�veis de inst�ncia) da classe
	
		private String nomeProduto;
		private String marca;
		private String modelo;
		private String estado;
		private int preco;
		private int codigo;
		
		//m�todo especial CONSTRUTOR
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
		//declara��o dos demais m�todos da classe
		public void apresentarInfo()
		{
			System.out.println("Produto Eletr�nico = "+nomeProduto+"\nMarca =  "+marca+"\nModelo = "+modelo
					+"\nEstado de Uso =  "+estado+"\nPre�o = "+preco+"\nC�digo = "+codigo);
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
