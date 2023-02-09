package aula_java;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
	
		
		
		//EXERCÍCIO 3 


	float salb,adic,hext,desc;
	
	
	Scanner Leia= new Scanner(System.in); 
	
	System.out.println("\n Digite seu Salário Bruto:");
	salb= Leia.nextFloat();
	System.out.println("\nInsira Adicional Noturno:");
	adic= Leia.nextFloat();
	System.out.println("\nHora Extra:");
	hext= Leia.nextFloat();
	System.out.println("\n Descontos:");
	desc= Leia.nextFloat();
	
	float liqui= (salb+adic)+(hext*5)-(desc);
	
	 System.out.printf("\nA Seu salário líquido é: %.2f ",liqui);

	

	 
	//  -------  EXERCÍCIO 4 
		
	 System.out.println("\nDIFERENÇA");

	 
	 
	int n1,n2,n3,n4;
			 
	Scanner Leia1= new Scanner(System.in); 

	System.out.println("\nEntre com a primeira nota:");
	n1= Leia1.nextInt();
	System.out.println("\nEntre com a segunda nota:");
	n2= Leia1.nextInt();
	System.out.println("\nEntre com a terceira nota:");
	n3= Leia1.nextInt();
	System.out.println("\nEntre com a terceira nota:");
	n4= Leia1.nextInt();

	int difer= (n1*n2)-(n3*n4);
	 
	 System.out.println("\nA diferença é  "+difer);


	

} 
}