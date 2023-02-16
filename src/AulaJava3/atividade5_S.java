package AulaJava3;

import java.util.Scanner;

public class atividade5_S {
	public static void main(String[] args) {
	
		    int cod, quant;
			float valor;
			Scanner Leia= new Scanner(System.in); 

			System.out.println("\n escolha seu lanchinho! :");

			System.out.println("\n lanche 1:");
		
			System.out.println("\n lanche 2");
			
			System.out.println("\n lanche 3");
		
			System.out.println("\n lanche 4:");
	
			System.out.println("\n lanche 5");

			System.out.println("\n qual sua escolha?");
			cod= Leia.nextInt();
			System.out.println("\n e a quantidade?");
			quant= Leia.nextInt();
			
			switch(cod) {
			case 1:
				valor = quant *10;
				System.out.println("\nProduto: Cachorro Quente - Valor a pagar: "+valor);
			break;
	
			case 2:
				valor = quant *6;
				System.out.println("\nProduto: Cachorro Quente - Valor a pagar: "+valor);
			break;
	
			case 3:
				valor = quant *3;
				System.out.println("\nProduto: Cachorro Quente - Valor a pagar: "+valor);
			break;
	
			case 4:
				valor = quant *12;
				System.out.println("\nProduto: Bauru - Valor a pagar: "+valor);
				break;
			case 5:
				valor = quant *9;
				System.out.println("\nProduto: Refrigerante - Valor a pagar: "+valor);
				break;
			case 6:
				valor = quant *13;
				System.out.println("\nProduto: Suco de laranja - Valor a pagar: "+valor);
				break;
				default:
					System.out.println("\nOpção Inválida");
			}
	
	
	
	}
}