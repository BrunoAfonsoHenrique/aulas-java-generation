package Atividade02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) 
	{	
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite o 1� n�mero:");
		num1 = leia.nextInt();
		
		System.out.print("Digite o 2� n�mero:");
		num2 = leia.nextInt();
		
		System.out.print("Digite o 3� n�mero:");
		num3 = leia.nextInt();
		
		if(num1 <= num2 && num2 <= num3) {
			System.out.print("\n"+ num1+ " " + num2+ " " + num3);
		}
		else if(num1 <= num3 && num3 <= num2) {
			System.out.print("\n"+ num1+ " " + num3+ " " + num2);
		}
		
		
		else if(num2 <= num1 && num1 <= num3) {
			System.out.print("\n"+ num2+ " " + num1+ " " + num3);
		}
		
		else if(num2 <= num3 && num3 <= num1) {
			System.out.print("\n"+ num2+ " " + num3+ " " + num1);
		}
		
		else if(num3 <= num1 && num1 <= num2) {
			System.out.print("\n"+ num3+ " " + num1+ " " + num2);
		}
		
		else if(num3 <= num2 && num2 <= num1) {
			System.out.print("\n"+ num3+ " " + num2+ " " + num1);
		}
				
	}

}