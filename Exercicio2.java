package LacosCondicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o Número: ");
		numero = ler.nextInt();
		
	if(numero % 2 ==0 && numero > 0){
		System.out.println("\nO Número "+numero + " é par e Positivo");	
	}
	else if(numero % 2 != 0 && numero < 0) {
		System.out.println("\nO Número "+numero + " é impar e Negativo");	
	}
	else if(numero % 2== 0 && numero < 0) {
		System.out.println("\nO Número "+numero + " é par e Negativo");
	}
	else if(numero % 2 != 0 && numero > 0) {
		System.out.println("\nO Número "+numero + " é impar e Positivo");
	}
	else {
		System.out.println("\nOpção invalida, favor tentar novamente");
	}
	} 

}
