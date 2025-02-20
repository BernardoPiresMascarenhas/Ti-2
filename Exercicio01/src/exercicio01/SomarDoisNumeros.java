package exercicio01;

import java.util.Scanner;

public class SomarDoisNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um numero: ");
		
		int num1 = sc.nextInt();
		
		System.out.printf("Digite outro numero: ");
		
		int num2 = sc.nextInt();
		
		
		int soma = num1 + num2;
		
		
		System.out.println("O resultado da soma foi: " + soma);
		
	
		sc.close();
	}
}
