
package inventario;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		Scanner scanProd = new Scanner(System.in);
		System.out.println("Digite o nome do produto: ");
		String nome = scanProd.nextLine();
		System.out.println("Digite o codigo: ");
		int cod = scanProd.nextInt();
		System.out.println("Digite a quantidade: ");
		int qnt = scanProd.nextInt();
		System.out.println("Digite o valor: ");
		double valor = scanProd.nextDouble();
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto("Xbox", 9, 8, 1889.9);
		Produto p4 = new Produto(nome, cod, qnt, valor);
		System.out.println(p4.getNome());
		
	}

}
