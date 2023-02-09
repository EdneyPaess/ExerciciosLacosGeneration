package condicionalSwitch;

import java.util.Scanner;

public class exercicios2 {

	public static void main(String[] args) {
		String nome;
		int codigoCargo;
		float salario, novoSalario;
		
		Scanner leia= new Scanner(System.in);
		
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();	
		
		System.out.println("Cargos");
		System.out.println("1- Gerente");
		System.out.println("2- Vendedor");
		System.out.println("3- Supervisor");
		System.out.println("4- Motorista");
		System.out.println("5- Estoquista");
		System.out.println("6- Técnico de TI");
		System.out.println("Digite seu cargo de acordo com a ordem dos numeros: ");
		codigoCargo = leia.nextInt();	
		
		System.out.println("Digite seu salario: ");
		salario = leia.nextFloat();	
		
		switch (codigoCargo) {
		case 1: 
			novoSalario = (float) (salario +(salario * 0.10)); 
			System.out.println("\n Seu novo salario com reajuste é:: "+novoSalario);
			break;
		case 2:
			novoSalario = (float) (salario +(salario * 0.07));
			System.out.println("\n Seu novo salario com reajuste é:: "+novoSalario);
			break;
		case 3:
			novoSalario = (float) (salario +(salario * 0.09));
			System.out.println("\n Seu novo salario com reajuste é:: "+novoSalario);
			break;
		case 4:
			novoSalario = (float) (salario +(salario * 0.06));
			System.out.println("\n Seu novo salario com reajuste é:: "+novoSalario);
			break;
		case 5:
			novoSalario = (float) (salario +(salario * 0.5));
			System.out.println("\n Seu novo salario com reajuste é:: "+novoSalario);
			break;
		case 6:
			novoSalario = (float) (salario +(salario * 0.08));
			System.out.println("\n Seu novo salario com reajuste é:: "+novoSalario);
			break;
			default:
			System.out.println("\n Opção invalida");
		}
		
	}	
		
}


