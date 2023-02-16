package AulaJava3;

import java.util.Scanner;

public class ifatv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem
		//indicando se este número é par ou ímpar e se o número é positivo ou negativo. Veja os exemplos abaixo:

		
		
		 int num;
			
			Scanner Leia= new Scanner(System.in); 
			
			System.out.println("\nEntre com um número: ");
			num = Leia.nextInt();
			
			if(num % 2 == 0) {
				if(num>=0) {
					System.out.println("\nNúmero par e positivo!!!");
				}
				else {
					System.out.println("\nNúmero par e negativo!!!");
				}
			}else {
				if(num>0) {
					System.out.println("\nNúmero ímpar e positivo!!!");
				}else {
					System.out.println("\nNúmero ímpar e negativo!!!");
				}
			}

		}

	}
	
		

	
	

			
		   
	
		
		
		
		
		
		
		
		


