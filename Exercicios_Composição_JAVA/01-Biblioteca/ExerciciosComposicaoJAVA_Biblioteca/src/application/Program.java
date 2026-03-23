package application;

import java.util.Scanner;
import java.util.Locale;
import entities.*;

public class Program {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();
		System.out.println("--- ENCONTRAR NOMES DE LIVROS POR NACIONALIDADE ---");
		System.out.print("Quantos livros serão adicionados: ");
		int x = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < x; i++) {
			System.out.print("----------------\n");
		    System.out.println("DADOS DO #" + (i + 1) + " LIVRO:");
		    System.out.print("Digite o nome do livro: ");
		    String titulo = sc.nextLine();
		    System.out.print("Digite o ano do livro: ");
		    int ano = sc.nextInt();
		    sc.nextLine();
		    System.out.print("Digite o nome do Autor do livro: ");
		    String nome = sc.nextLine();
		    System.out.print("Digite a nacionalidade do autor do livro: ");
		    String nacionalidade = sc.nextLine();
		    Autor autor = new Autor(nome, nacionalidade);
		    Livro livro = new Livro(titulo, ano, autor);
		    biblioteca.addLivro(livro);
		    System.out.println("----------------\n");
		}
		System.out.print("Digite uma nacionalidade: ");
		String nacionalidadeEscolhida = sc.nextLine();
		System.out.println(biblioteca.returnNacionalidade(nacionalidadeEscolhida));
	}
}
