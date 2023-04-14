package LacosCondicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		int A,B,C;
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o Número A: ");
		A = ler.nextInt();
		System.out.println("Digite o Número B: ");
		B = ler.nextInt();
		System.out.println("Digite o Número C: ");
		C = ler.nextInt();
		
		if(A+B >C) {
			System.out.println("\nA Soma de A + B é Maior do que C");
		}
		else if(A+B < C) {
			System.out.println("\nA Soma de A + B é Menor do que C");		
		}
		else if(A+B == C) {
			System.out.println("\nA Soma de A + B é Igual a C");
		}
		else {
			System.out.println("\nOpção Inválida, favor tentar novamente");
		}
	}

}
