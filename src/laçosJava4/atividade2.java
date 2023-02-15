package laçosJava4;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		
	//	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)		
		
		
	    int idade, somamenos21=0;
	    int somais = 0;
		
		Scanner leia= new Scanner(System.in);  
		
		System.out.println("\n Digite seu quantos anos voce tem :");
		idade= leia.nextInt();
		
		
		while (idade!= -99) {
		 if ( idade<21) { 
			 somamenos21=somamenos21+1;
			 }
		
		 else if  (idade> 50) {
		 somais=somais+1;
		 }
		 
		 idade= leia.nextInt();
    
		}
    System.out.println("Você digitou -99 e saiu do loop!");
    System.out.println("Pessoas com menos de 21 anos: " + somamenos21);
    System.out.println("Pessoas com mais de 50 anos: "+ somais);

		}}