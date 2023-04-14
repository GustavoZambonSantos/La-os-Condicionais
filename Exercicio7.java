package LacosCondicionais;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {

	float numero1,numero2, total;
	int codigo;
	
	
	Scanner ler = new Scanner (System.in);
	
	System.out.println("Operação");
	System.out.println("\n1 - Soma");
	System.out.println("\n2 - Subtração");
	System.out.println("\n3 - Multiplicação");
	System.out.println("\n4 - Divisão");
	
	System.out.println("Digite o 1ºNúmero: ");
	numero1 = ler.nextFloat();
	System.out.println("Digite o 2ºNúmero: ");
	numero2 = ler.nextFloat();
	
	System.out.println("Digite a Operação: ");
	codigo = ler.nextInt();
	
	switch(codigo) {
	case 1:
		total = numero1 + numero2;
		System.out.println(numero1+" + "+numero2+" = "+total);
		break;
	case 2:
		total = numero1 - numero2;
		System.out.println(numero1+" - "+numero2+" = "+total);
		break;
	case 3:
		total = numero1 * numero2;
		System.out.println(numero1+" * "+numero2+" = "+total);
		break;
	case 4:
		total = numero1 / numero2;
		System.out.println(numero1+" / "+numero2+" = "+total);
		break;
	default: 
		System.out.println("\nOpção Invalida, favor tentar novamente");
	}
	}
	
}


