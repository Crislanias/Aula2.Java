package aula_java2;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {

		// 2. Faça um programa que leia a idade de uma pessoa expressa em dias e
		// mostre-a
		// expressa em anos, meses e dias (considere que: 1 ano = 365 dias / 1 mês = 30
		// dias e 1 dia = 1 dia em todos os casos).

		int dias;

		Scanner Leia = new Scanner(System.in);

		System.out.println("\n Vamos conferir sua idade em dias? \n Digite a seguir:");

		System.out.println("\n Quantos dias de vida você tem?");
		dias = Leia.nextInt();

		int resul = (dias / 365); // anos
		int result2 = (dias % 365) / 30; // meses
		int result3 = (dias % 1) % 30;// dias

		System.out.println("\n Você tem:" + resul + " anos," + result2 + " meses e " + result3 + " dias de vida!");

	}
}