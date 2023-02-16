package AulaJava3;

import java.util.Scanner;

public class laco_condicional_IFeSWITCH {

	public static void main(String[] args) {
		
		/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.
		 
		Na construção do Algoritmo, utilize os seguintes conteúdos:
			Entrada e Saída de dados
			Operadores
			Laço Condicional IF* 
			 */

          int a,b,c;
		
		Scanner Leia= new Scanner(System.in); 
		
	
		System.out.println("\n Entre com sua primeira nota:");
		a = Leia.nextInt();
		System.out.println("\n Entre com sua segunda nota:");
		b = Leia.nextInt();
		System.out.println("\n Entre com sua terceira nota:");
		c = Leia.nextInt();
		


		if((a+b)>c) {
		System.out.println(" maior que AB");
		}
		else if((a+b)<c) {
		System.out.println("\n menor que AB");
		}
		else { System.out.println("\nvalores iguais");
		}

	


		
		
		
	
	
}}