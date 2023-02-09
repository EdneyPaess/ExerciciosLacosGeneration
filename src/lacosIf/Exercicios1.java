package lacosIf;

import java.util.Scanner;

public class Exercicios1 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		Double a,b,c, soma;
		
		System.out.println("Digite o valor A: ");
		a = entrada.nextDouble();
		System.out.println("Digite o valor B: ");
		b = entrada.nextDouble();
		System.out.println("Digite o valor C: ");
		c = entrada.nextDouble();
		
		soma= a+b;
		
		System.out.println("O resultado de A+B é: "+soma);
		
		if(soma >= c) {
			System.out.printf("A Soma de A + B é Maior do que C: %.2f",a);
		
		}else if(soma < c) {
			System.out.printf("A Soma de A + B é Menor do que C: %.2f",b);
			
		}else {
			System.out.printf("A Soma de A + B é Igual a C: %.2f", c);
		}
		
	}

}
