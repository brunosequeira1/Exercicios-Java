package Turma24;


public class Aviao {

	//declaração dos atributos(variáveis de instância) da classe
	
			private String companhia;
			private String modelo;
			private String uso;
			private int capacidade;
			private int velocidade;
						
			//método especial CONSTRUTOR
			public Aviao(String companhia,String modelo,String uso, 
					int c, int v)
			{
				this.companhia = companhia;
				this.modelo = modelo;
				this.uso = uso;
				this.setCapacidade (c);
				this.setVelocidade (v);
				
			}
			
			//declaração dos demais métodos da classe
			public void apresentarInfo()
			{
				System.out.println("Avião da companhia "+companhia+", modelo "+modelo
						+", para uso "+uso+", com capacidade para "+capacidade+ " pessoas e capaz de "
								+ "alcançar "+velocidade+" km/h.");
			}
			
			public void setCapacidade(int c) 
			{
				capacidade = c;
			}
			
			public void setVelocidade(int v) 
			{
				velocidade = v;
			}

			public String getCompanhia() {
				return companhia;
			}

			public void setCompanhia(String companhia) {
				this.companhia = companhia;
			}

			public String getModelo() {
				return modelo;
			}

			public void setModelo(String modelo) {
				this.modelo = modelo;
			}

			public String getUso() {
				return uso;
			}

			public void setUso(String uso) {
				this.uso = uso;
			}

			public int getCapacidade() {
				return capacidade;
			}

			public int getVelocidade() {
				return velocidade;
			}	
			
}
