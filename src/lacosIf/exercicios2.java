package lacosIf;

import java.util.Scanner;

public class exercicios2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero;
		System.out.println("Digite um numero inteiro");
		numero = entrada.nextInt();

		if (numero % 2 == 0) {
			if(numero>0) {
				System.out.println("É par e positivo");
			}else {
				System.out.println("É par e negativo");
			
			}
		
		}else {
			if(numero>0) {
				System.out.println("É impar e positivo");
			}else {
				System.out.println("É impar e negativo");
			}
		}
		
	}
}
