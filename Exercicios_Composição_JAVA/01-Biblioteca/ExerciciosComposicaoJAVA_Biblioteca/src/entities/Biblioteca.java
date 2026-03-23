package entities;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Livro> listaLivros = new ArrayList<>();
	
	public Biblioteca() {
		
	}
	public List<Livro> getListaLivros() {
		return listaLivros;
	}
	public void addLivro(Livro livro) {
		listaLivros.add(livro);
	}
	public void removeLivro(Livro livro) {
		listaLivros.remove(livro);
	}
	public String returnNacionalidade(String nacionalide) {
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		for(Livro livro: listaLivros) {
			if(livro.getAutor().getNacionalidade().equalsIgnoreCase(nacionalide)) {
				sum += 1;
				sb.append("Titulo do #" + sum + " Livro: " + livro.getTitulo() + "\n");
			}
		}
		return sb.toString();
	}
}
