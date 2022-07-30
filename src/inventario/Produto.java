package inventario;

public class Produto {

	//Declarações de campo de instância
	private String nome;
	private int itemNumero;
	private int unidades;
	private double preco;
	
	public Produto() {
		nome = "";
		itemNumero = 0;
		unidades = 0;
		preco = 0.0;
	}
	
	public Produto(String nome, int itemNumero, int unidades, double preco) {
		this.nome = nome;
		this.itemNumero = itemNumero;
		this.unidades = unidades;
		this.preco = preco;
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
}
