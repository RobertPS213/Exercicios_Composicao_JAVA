package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Passageiro;
import entities.Voo;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("--- AEROPORTO BRASÍLIA ---");
		System.out.print("Voo: ");
		String nomeVoo = sc.nextLine();
		System.out.print("Capacidade: ");
		int capacidade = sc.nextInt();
		
		Voo voo = new Voo(nomeVoo, capacidade);

		char statusEmbarque = 'C';
		while (statusEmbarque != 'F') {
			sc.nextLine();
			
			int proximo = voo.getListaPassageiros().size() + 1;
			
			System.out.print("\nDigite o nome do " + proximo + "º passageiro: ");
			String nome = sc.nextLine();
			System.out.print("Digite o Passaporte: ");
			String passaporte = sc.nextLine();

			Passageiro p = new Passageiro(nome, passaporte);
			System.out.println(voo.embarcar(p));

			System.out.print("\n(C)ONTINUAR OU (F)INALIZAR: ");
			statusEmbarque = sc.next().toUpperCase().charAt(0);
		}

		System.out.println("\n--- RELATÓRIO FINAL DE EMBARQUE ---");
		System.out.println(voo.listarPassageiros());
		
		sc.close();
	}
}
