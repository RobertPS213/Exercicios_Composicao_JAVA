package application;

import java.util.Scanner;
import entities.*;
import entities.enums.*;

public class Program {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos jogadores voce irá adicionar: ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome do time: ");
		String nomeTime = sc.nextLine();
		Time time = new Time(nomeTime);
		for(int i = 0; i < x; i++) {
			System.out.print("Digite o nome do Jogador: ");
			String nomeJogador = sc.nextLine();
			System.out.print("digite a posição do jogador: ");
			String posicao = sc.nextLine();
			Jogador jogador = new Jogador(nomeJogador, Posicao.valueOf(posicao));
			time.addJogador(jogador);
		}
		System.out.print("Adicione um novo jogador: ");
		String nomeJogador2 = sc.nextLine();
		System.out.print("digite a posição do jogador: ");
		String posicao2 = sc.nextLine();
		Jogador jogadorNovo = new Jogador(nomeJogador2, Posicao.valueOf(posicao2));
		System.out.print(time.adicionarJogador(jogadorNovo));
		System.out.print("\n" + "Escalação: " + "\n" + time.exibirEscalação());
	}
}
