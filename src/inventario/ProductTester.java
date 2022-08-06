
package inventario;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		int maxSize = 0;
		Scanner scanProd = new Scanner(System.in);
		do {
			if(maxSize < 0) {
				System.out.print("Valor incorreto inserido \n \n");
			}
			System.out.println("Digite quantos produtos deseja adicionar: \n \n Digite 0 para não adicionar nenhum.");
			maxSize = scanProd.nextInt();
		}while(maxSize < 0);
		scanProd.nextLine();
		if(maxSize == 0) {
			System.out.print("Nenhum produto será adicionado");
		}else {
			Produto[] p = new Produto[maxSize];
			for(int i = 0; i < maxSize; i++) {
				System.out.println("Digite o nome do produto: ");
				String nome = scanProd.nextLine();
				System.out.println("Digite o codigo: ");
				int cod = scanProd.nextInt();
				System.out.println("Digite a quantidade: ");
				int qnt = scanProd.nextInt();
				System.out.println("Digite o valor: ");
				double valor = scanProd.nextDouble();
				System.out.println("Esse item estará ativo? \n 1 - Sim, 2 - Não");
				int atividade = scanProd.nextInt();
				p[i] = new Produto(nome, cod, qnt, valor, atividade);
				scanProd.nextLine();
				System.out.println(p[i]+"\n \n");
			}
		}
		
		
	}

}
