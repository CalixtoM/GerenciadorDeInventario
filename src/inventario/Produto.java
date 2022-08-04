package inventario;

public class Produto {

	//Declarações de campo de instância
	private String nome;
	private int itemNumero;
	private int unidades;
	private double preco;
	private boolean ativo;
	
	public Produto() {
		nome = "";
		itemNumero = 0;
		unidades = 0;
		preco = 0.0;
		ativo = true;
	}
	
	public Produto(String nome, int itemNumero, int unidades, double preco, int ativo) {
		this.nome = nome;
		this.itemNumero = itemNumero;
		this.unidades = unidades;
		this.preco = preco;
		if(ativo == 1) {
			this.ativo = true;
		}else {
			this.ativo = false;
		}
	}
	
	//Retorna o nome
	public String getNome() {
		return nome;
	}
	
	//define o nome
	public void setNome(String nm) {
		nome = nm;
	}
	
	//retorna o numero do item
	public int getItemNumero() {
		return itemNumero;
	}
	
	//define o numero do item
	public void setItemNumero(int itNum) {
		itemNumero = itNum;
	}
	
	//retorna as unidades
	public int getUnidade() {
		return unidades;
	}
	
	//define a quantidade de unidades
	public void setUnidade(int unit) {
		unidades = unit;
	}
	
	//retorna o preco
	public double getPreco() {
		return preco;
	}
	
	//define o preco
	public void setPreco(double price) {
		preco = price;
	}
	
	public boolean getAtivo() {
		return ativo;
	}
	
	public void setAtivo(int atividade) {
		if(atividade == 1) {
			ativo = true;
		}else {
			ativo = false;
		}
	}
	
	@Override
	public String toString() {
		return "Nome produto: " + this.nome + ", Número: " + this.itemNumero +
			   ", Unidades: " + this.unidades + ", Preço: " + this.preco + 
			   ", Ativo: " + ((this.ativo == true) ? "Ativo" : "Descontinuado");
	}
}
