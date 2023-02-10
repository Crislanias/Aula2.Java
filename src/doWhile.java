package laçosJava;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
//		Scanner
		Scanner leia = new Scanner(System.in);
	
		int i = 0, num, somaPositivos, contagem = 0, res = 0;

		
		num = 1;
		do {
			System.out.println("Digite aqui o número: ");
			num = leia.nextInt();

			if (num > 0) {
				res = +contagem;
			}
			contagem++;
		} while (num != 0);
		res+=contagem;
		System.out.println("Os números positivos são: " + res);
	}}