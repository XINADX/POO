package br.com.imc.main;

import java.util.Scanner;
import br.com.imc.pessoa.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int classificacao = 0;
		String sair = "s";
		do {
			do {
				System.out.println("1) Atleta ou 2) Não atleta");
				System.out.print("Informe sua classificação: ");
				classificacao = scanner.nextInt();
				scanner.nextLine();
				if(classificacao == 1) {
					Atleta atleta = new Atleta();
					System.out.print("Informe seu nome: ");
					atleta.setNome(scanner.nextLine());
					System.out.print("Informe o esporte praticado: ");
					atleta.setEsportePraticado(scanner.nextLine());
			        System.out.print("Informe seu peso(kg): ");
			        atleta.setPeso(scanner.nextDouble());
			        System.out.print("Informe sua altura(m): ");
			        atleta.setAltura(scanner.nextDouble());
			        System.out.println();
					atleta.calcularImc();
					atleta.exibirInfo();
				} else if(classificacao == 2) {
					Pessoa pessoa = new Pessoa();
			        System.out.print("Informe seu nome: ");
			        pessoa.setNome(scanner.nextLine());
			        System.out.print("Informe seu peso(kg): ");
			        pessoa.setPeso(scanner.nextDouble());
			        System.out.print("Informe sua altura(m): ");
			        pessoa.setAltura(scanner.nextDouble());
			        System.out.println();
			        pessoa.calcularImc();
					pessoa.exibirInfo();
				} else {
					System.out.println("Classificação inválida!\n");
				}
			} while((classificacao != 1) && (classificacao != 2));
			scanner.nextLine();
			System.out.print("Deseja calcular outro IMC (S - Sim ou N - Não): ");
			sair = scanner.nextLine();
			System.out.println();
		} while(sair.equalsIgnoreCase("s"));
		
		System.out.println("Obrigada por utilizar nosso sistema!");
		scanner.close();
			
		/*Pessoa pessoa = new Pessoa ("Daniela", 61.0, 1.63, 0.0);
        pessoa.calcularImc();
		pessoa.exibirInfo();
		
		System.out.println();
        
		Atleta atleta = new Atleta ("Daniela", 61.0, 1.63, 0.0, "Volêi");
		atleta.calcularImc();
		atleta.exibirInfo();*/
	}
}
