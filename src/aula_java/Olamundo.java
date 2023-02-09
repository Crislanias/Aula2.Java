package aula_java;

import java.util.Scanner;

public class Olamundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String nome= "Thiago Ferreira";
int idade= 31;
double altura =1.70;
double nota1,nota2,nota3, media;

Scanner leia= new Scanner(System.in); //aqui estou criando a leitura do meume usuardio

System.out.println("\nSeu nome é: "+nome);
System.out.println("\nSua idade é: "+idade);
System.out.println("\nSua altura é: "+altura);

System.out.println("\nEntre com a primeira nota:");
nota1= leia.nextDouble();
System.out.println("\nEntre com a segunda nota:");
nota2= leia.nextDouble();
System.out.println("\nEntre com a terceira nota:");
nota3= leia.nextDouble();

media= (nota1+nota2+nota3)/3;

//System.out.println("\nMédia do aluno "+nome+ foi de:"+media);

System.out.printf("\nMédia do aluno %s foi de:%.0f e a nota 1 foi de:%.0f",nome,media,nota1);

	
} }

