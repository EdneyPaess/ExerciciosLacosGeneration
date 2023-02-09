package condicionalSwitch;

import java.util.Scanner;

public class exercicios1 {

	public static void main(String[] args) {
		int codigo, quantidade,valorTotal;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("\n Lanchonete x9"); //nome da lanchonete e  cardapio
		System.out.println("\n Codigo 1 -Cachorro Quente - R$ 10.00 ");
		System.out.println("\n Codigo 2 -X-Salada - R$ 15.00 ");
		System.out.println("\n Codigo 3 -X-Bacon - R$ 18.00 ");
		System.out.println("\n Codigo 4 -Bauru - R$ 12.00 ");
		System.out.println("\n Codigo 5 -Refrigerante - R$ 8.00 ");
		System.out.println("\n Codigo 6 -Suco de laranja - R$ 13.00 ");
		System.out.println("\n Digite o codigo do produto: ");
		codigo = leia.nextInt(); // armazenando o codigo do produto dentro da variavel codigo
		System.out.println("\n Digite a quantidade de produtos: ");
		quantidade = leia.nextInt(); //armazenando a quantidade dentro da variavel quantidade
		
		switch (codigo) { // aqui o codigo para verificar qual lanche escolheu
		case 1: 
			valorTotal = quantidade *10; //quantidade * valor do produto
			System.out.println("\n Produto Chachorro Quente - Valor a pagar: "+valorTotal);
			break;
		case 2: 
			valorTotal = quantidade *15;
			System.out.println("\n Produto X-Salada - Valor a pagar: "+valorTotal);
			break;
		case 3: 
			valorTotal = quantidade *18;
			System.out.println("\n Produto X-Bacon - Valor a pagar: "+valorTotal);
			break;
		case 4: 
			valorTotal = quantidade *12;
			System.out.println("\n Produto Bauru - Valor a pagar: "+valorTotal);
			break;
		case 5: 
			valorTotal = quantidade *8;
			System.out.println("\n Produto Refrigerante - Valor a pagar: "+valorTotal);
			break;
		case 6: 
			valorTotal = quantidade *13;
			System.out.println("\n Suco de laranja - Valor a pagar: "+valorTotal);
			break;
			default:
				System.out.println("\n Opção invalida");
		}
			

		
		

	}

}
