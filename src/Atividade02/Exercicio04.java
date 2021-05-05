package Atividade02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		double num, raiz, potencia;
		
		System.out.print("Digite um numero: ");
		num = leia.nextFloat();
		
		if(num % 2 == 0) {
			raiz = Math.sqrt(num);
			System.out.printf("\n" + num + " é numero par. Raiz = %2.2f", raiz);
		}
		else {
			potencia = Math.pow(num, 2);
			System.out.println("\n" + num + " é numero ímpar. Potência = " + potencia);
		}
	}

}
