package lacosIf;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String palavra1,palavra2,palavra3;
		
		System.out.println("\n Entre com a primira palavra:");
		palavra1 = entrada.nextLine();
		System.out.println("\n Entre com a segunda palavra:");
		palavra2 = entrada.nextLine();
		System.out.println("\n Entre com a terceira palavra:");
		palavra3 = entrada.nextLine();
		
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			if(palavra2.equalsIgnoreCase("ave")) {
				if(palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("\n É uma aguia:");
					
				}else {
					System.out.println("\n É uma pomba:");
				}
			}else {
				if(palavra3.equalsIgnoreCase("Onivoro")) {
					System.out.println("\n É um ser humano:");
				}else {
					System.out.println("\n É uma aguia:");
				}
			}
			
			
		}else {
			if(palavra2.equalsIgnoreCase("inseto")) {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("\n É uma pulga:");
				}else {
					System.out.println("\n É uma lagarta:");
				}
			}else {
				if(palavra3.equalsIgnoreCase("Hematófago")) {
					System.out.println("\n É uma Sanguessuga:");
				}else {
					System.out.println("\n É uma minhoca:");
				}
			}
		}
		

	}

}
