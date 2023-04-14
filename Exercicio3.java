package LacosCondicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
	String nome, opcao;
	int idade;
	
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o Nome do doador: ");
	nome = ler.nextLine();
	System.out.println("Digite a Idade do doador: ");
	idade = ler.nextInt();
	System.out.println("Primeira doação de sangue? ");
	boolean escolha = ler.nextBoolean();
	
	

	if (idade >=60 && idade <=69) {
		System.out.println("\n"+nome+" Não está apto para doar sangue!");
	}
	else if( idade >=60 && idade <=69) {
		System.out.println("\n"+nome+" está está apto para doar sangue!");
	}
	else if(idade >=18 && idade <60) {
		System.out.println("\n"+nome+" está está apto para doar sangue!");
	}
	else if (idade >=18 && idade <60) {
		System.out.println("\n"+nome+" está está apto para doar sangue!");
	}
	else if(idade <18) {
		System.out.println("\n"+nome+" Não está apto para doar sangue!");
	}
	else {
		System.out.println("\nOpção Invalida, favor tentar novamente.");
	}
	
	}
}
		

		


