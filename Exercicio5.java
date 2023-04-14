package LacosCondicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
	
		int cod;
		int quantidade;
		double valorTotal;
		
		Scanner ler = new Scanner(System.in);
		
		
		
		System.out.println("\nSelecione uma das opções");
		System.out.println("\n1 - Cachorro Quente"+"Preço Unitario- R$10,00");
		System.out.println("\n2 - X-Salada"+"Preço Unitario - R$15,00");
		System.out.println("\n3 - X-Bacon"+" Preço Unitario - R$18,00");
		System.out.println("\n4 - Bauru"+"Preço Unitario - R$ 12,00");
		System.out.println("\n5 - Refrigerante"+"Preço Unitario - R$8,00");
		System.out.println("\n6 - Suco de laranja"+"Preço Unitario - R$13,00");
		
		System.out.println("\nCódigo do Produto: ");
		cod = ler.nextInt();
		
		
		switch(cod) {
		case 1:
			System.out.println("Quantidade:");
			quantidade = ler.nextInt();
			valorTotal = (quantidade * 10);
			System.out.printf("O valor Total é: %2.2f ",valorTotal);
			break;
		case 2:
			System.out.println("Quantidade:");
			quantidade = ler.nextInt();
			valorTotal = (quantidade * 15);
			System.out.printf("O valor Total é: %2.2f ",valorTotal);
			break;
		case 3:
			System.out.println("Quantidade:");
			quantidade = ler.nextInt();
			valorTotal = (quantidade * 18);
			System.out.printf("O valor Total é: %2.2f ",valorTotal);
			break;
		case 4:
			System.out.println("Quantidade:");
			quantidade = ler.nextInt();
			valorTotal = (quantidade * 12);
			System.out.printf("O valor Total é: %2.2f ",valorTotal);
			break;
		case 5:
			System.out.println("Quantidade:");
			quantidade = ler.nextInt();
			valorTotal = (quantidade * 8);
			System.out.printf("O valor Total é: %2.2f ",valorTotal);
			break;
		case 6:
			System.out.println("Quantidade:");
			quantidade = ler.nextInt();
			valorTotal = (quantidade * 13);
			System.out.printf("O valor Total é: %2.2f ",valorTotal);
			break;
			default: 
				System.out.println("\nOpção Invalida, favor tentar novamente");
		}
	
		}
		
		}
		
		
		
	


