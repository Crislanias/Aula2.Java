package AulaJava3;

import java.util.Scanner;

public class aulabase {

	public static void main(String[] args) {
		
		
		double n1,n2,n3,media;
		int op;
		
		Scanner leitura = new Scanner(System.in);
			System.out.println("\n Entre com sua primeira nota:");
			n1 = leitura.nextDouble();
			System.out.println("\n Entre com sua segunda nota:");
			n2 = leitura.nextDouble();
			System.out.println("\n Entre com sua terceira nota:");
			n3 = leitura.nextDouble();

			
			media= (n1+n2+n3)/3;
			System.out.printf("\n Sua média é %.2f",media);
			
			if (media>+7 && media<=10) 
				System.out.println("\nPARABÉNS VC FOI APROVADE !!");
			
			else if (media>=5 &&media>=0 && media<7) 
				System.out.println("\nATENÇÃO VC ESTÁ DE EXAME !!");
			else if (media>=0 && media<5)
				System.out.println("\nATENÇÃO VC FOI  REPROVADE !!");
			
			else System.out.println("\nPor favor, verifique as notas pois a média deu errado");

				// - 
			System.out.println("\n\t\tMenu de elogios");
			System.out.println("\nEscolha seu elegio para o time 60");
			System.out.println("\nbom");
			System.out.println("\nmuito bom");
			System.out.println("\nmaravilhoso");
			System.out.println("\ntop top");
			System.out.println(" \n DIGITE SUA OPÇÃO");
			op= leitura.nextInt(); // OP =!
	
		
		switch (op) {
		case 1: System.out.println("\ntop top");
		break;
		case 2: System.out.println("\bom ");
		break;
		case 3: System.out.println(" notimo top");
		break;
		
		default: System.out.println("opçao inválida");
		}
		
	}
}
