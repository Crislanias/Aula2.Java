package aula_java;

import java.util.Scanner;

public class exercicio1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EXERCÍCIO 1

		System.out.println("\nATUALIZAÇÃO DE SALÁRIO 2023");	
		
  float salário=10000.00f;
  float Abono=1000.00f;

Scanner leia= new Scanner(System.in);

System.out.println("\nSeu Salário é: "+salário);	
System.out.println("\nSeu abono é: "+Abono);

float novosalario= salário+Abono;

System.out.printf("\nMeu novo salário é: %.2f",novosalario);
	

	
	//-------  EXERCÍCIO 2-------------

System.out.println("\nCALCULE SUA NOTA DE CORTE AQUI:");

float nota1,nota2,nota3,nota4;

Scanner Leia= new Scanner(System.in); 

System.out.println("\nEntre com a primeira nota:");
nota1= leia.nextFloat();
System.out.println("\nEntre com a segunda nota:");
nota2= leia.nextFloat();
System.out.println("\nEntre com a terceira nota:");
nota3= leia.nextFloat();
System.out.println("\nEntre com a terceira nota:");
nota4= leia.nextFloat();

float média= (nota1+nota2+nota3+nota4)/4;
 
 System.out.printf("\nA média das suas notas é:%.0f", média);
 
 System.out.println("\nAté logo e bons estudos");

 
 
 
 
 
 
 
 
	
	
	}

}
