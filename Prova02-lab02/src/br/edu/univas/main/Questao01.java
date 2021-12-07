package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Veiculo;
import br.edu.univas.vo.Motor;

public class Questao01 {
	
	public static void main (String []args) {
		Scanner scanner = new Scanner (System.in);
		
		Veiculo[] carro = new Veiculo [50];
		
		int opcao = 0;
		int posicao = 0;
		
		do {
		printMenu();
		opcao = lendoVariavel(scanner);
		
		if (opcao == 1) {
			cadastroCarro(scanner, carro, posicao);
			posicao++;
		}
		
		if (opcao == 2) {
			listarCarros(carro, posicao);
		}
		
		if (opcao == 3) {
			
		}
		
		if (opcao != 4) {
			System.out.println("Por favor, digite uma opção correta!");
		}
		
		else {
			System.out.println("Até mais!");
			
		} 
		}
		while (opcao != 4);
	}
		

	public static void printMenu() {
		System.out.println("1 - Cadastro de Veículo");
		System.out.println("2 - Listar todos os veículos");
		System.out.println("3 - Remover um veículo cadastrado");
		System.out.println("4 - Sair");
		System.out.println("Por favor, digite a opção desejada: ");
	}
	
	public static int lendoVariavel(Scanner scanner) {
		int variavel = scanner.nextInt();
		scanner.nextLine();
		return variavel;
	}
	
	public static void cadastroCarro(Scanner scanner, Veiculo[] carro, int posicao) {
		System.out.println("--- Cadastro de novo carro ---");
		
		Veiculo carros = new Veiculo();
		System.out.println("Por favor, digite a marca: ");
		carros.marca = scanner.nextLine();
		
		System.out.println("Por favor, digite a cor:");
		carros.cor = scanner.nextLine();
		
		System.out.println("Por favor, digite o ano de fabricação: ");
		carros.ano_fabricacao = lendoVariavel(scanner);
		
		System.out.println("Por favor, digite o ano do modelo: ");
		carros.ano_modelo = lendoVariavel(scanner);
		
		System.out.println("Por favor, digite a potência: ");
		carros.motores.potencia = scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("Por favor, digite a quantidade de cilindros: ");
		carros.motores.cilindros = lendoVariavel(scanner);
		
		carro[posicao] = carros;
	}
	
	public static void listarCarros(Veiculo[]carro, int posicao) {
		System.out.println("::: Carros Cadastrados :::");
		for (int i = 0; i < posicao; i++) {
			System.out.println("\n Carro " + (i + 1) + ": ");
			
			Veiculo carros = carro[i];
			
			System.out.println("Marca: " + carros.marca);
			System.out.println("Cor: " + carros.cor);
			System.out.println("Ano fabricação: " + carros.ano_fabricacao);
			System.out.println("Ano do modelo: " + carros.ano_modelo);
			System.out.println("Potência do motor: " + carros.motores.potencia);
			System.out.println("Quantidade de cilindros: " + carros.motores.cilindros);
			
		}
	}
}
	
	
	