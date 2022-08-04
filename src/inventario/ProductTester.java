
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
		Produto p1 = new Produto(nome, cod, qnt, valor);
		scanProd.nextLine();
		System.out.println("Digite o nome do produto: ");
		nome = scanProd.nextLine();
		System.out.println("Digite o codigo: ");
		cod = scanProd.nextInt();
		System.out.println("Digite a quantidade: ");
		qnt = scanProd.nextInt();
		System.out.println("Digite o valor: ");
		valor = scanProd.nextDouble();
		Produto p2 = new Produto(nome, cod, qnt, valor);
		System.out.println(p1);
		
	}

}
