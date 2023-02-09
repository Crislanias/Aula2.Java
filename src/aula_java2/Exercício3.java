package aula_java2;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		
		
		//3. Faça um programa que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 

		
		int segundo,horas, minutos,segs;
		
		
		Scanner Leia= new Scanner(System.in); 
		
		System.out.println("\n Digite a duração do seu evento aqui");
		segundo= Leia.nextInt();
		
		
		horas= (segundo/3600); 
		segs= (segundo%3600);
		minutos=(segs/60); 
		segs=(segs%60);
		
		
		System.out.println("\n Seu tempo de evento é de: " + horas+ "horas,"+minutos+"minutos" +segs + "segundo");
		
		
		
		
		
		
		

	}

}
