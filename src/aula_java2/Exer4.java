package aula_java2;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		
		
		int a, b, c;
		
		Scanner Leia= new Scanner(System.in); 
		
		System.out.println("\n 1");
		a= Leia.nextInt();
		System.out.println("\n 2");
		b= Leia.nextInt();
		System.out.println("\n 3");
		c= Leia.nextInt();
		
		int r= (a+b)*(a+b);
		int s= (b+c)*(b+c); 
		
		int d= (r+s)/2;
		
		
		System.out.println("\n RESULTADO SOMA: "+d);

		
		
		
		
		
		
		
		
		
		

	}

}
