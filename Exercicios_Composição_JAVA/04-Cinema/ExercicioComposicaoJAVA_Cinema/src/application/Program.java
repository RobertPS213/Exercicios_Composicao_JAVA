package application;

import java.util.Scanner;

import entities.*;
import entities.enums.*;

public class Program {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--- CINE TAGUATINGA ---");
		System.out.print("Filme: ");
		String nomeFilme = sc.nextLine();
		Cinema cinema = new Cinema(nomeFilme);
		for(int i = 0; i < 10; i++) {
			Assento assento = new Assento((i + 1), TipoAssento.NORMAL, false);
			cinema.addAssento(assento);
		}
		System.out.println("Sala inicializada com 10 assentos (1 a 10).\n");
		for(int i = 0; i < 3; i++) {
			System.out.print("Digite o número do assento que deseja comprar: ");
			int numeroSelecionado = sc.nextInt();
			System.out.print("> " + cinema.venderIngresso(numeroSelecionado) + "\n\n");
		}
	}
}
