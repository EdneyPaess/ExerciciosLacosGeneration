package lacosIf;

import java.util.Scanner;

public class exercicios3 {

	public static void main(String[] args) {
		String nome;
		int idade;
		Boolean primeiroDoação;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		nome = entrada.nextLine();

		System.out.println("Digite sua idade:");
		idade = entrada.nextInt();

		System.out.println("É a sua primeira doação?: ");
		primeiroDoação = entrada.nextBoolean();

		if ((idade >= 18) && (idade <= 59)) {
			System.out.println(nome + " está apta para doar sangue!");

		} else if ((idade >= 60) && (idade <= 69)) {
			if (primeiroDoação == true) {

				System.out.println(nome + " não apta para doar sangue!");
			}else {
				System.out.println(nome + " está apta para doar sangue!");

			}}else {
				
			System.out.println(nome + " está apta para doar sangue!");
		}

	}

}
