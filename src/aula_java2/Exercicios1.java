package aula_java2;

import java.util.Scanner;

public class Exercicios1 {

	public static void main(String[] args) {
		
		// 1. Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

		
		int anos,meses, dias;
		
		Scanner Leia= new Scanner(System.in); 
		
		System.out.println("\n Vamos conferir sua idade em dias? \n Digite a seguir:");

		System.out.println("\n Digite seu quantos anos voce tem :");
		anos= Leia.nextInt();
		System.out.println("\n Digite quantos meses voce tem :");
		meses= Leia.nextInt();
		System.out.println("\n Digite seu dias :");
		dias= Leia.nextInt();
		
		int resul=(anos*365) +(meses*30)+ (dias);
		
		
		System.out.println("\n Você tem: "+resul + " dias de vida!");

		
		
		
		
		
		
		
		
		
	}

}
