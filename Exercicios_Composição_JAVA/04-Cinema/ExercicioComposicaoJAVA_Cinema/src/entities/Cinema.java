package entities;

import java.util.List;
import java.util.ArrayList;

public class Cinema {
	private String nomeFilme;
	private List<Assento> sala = new ArrayList<>();
	
	public Cinema() {
		
	}
	public Cinema(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public List<Assento> getSala() {
		return sala;
	}
	public void addAssento(Assento assento) {
		sala.add(assento);
	}
	public void removeAssento(Assento assento) {
		sala.add(assento);
	}
	public String venderIngresso(int numeroDesejado) {
		for(Assento assento: sala) {
			if (assento.getNumero() == numeroDesejado) {
	            if (assento.isOcupado()) {
	                return "Erro: Assento já está reservado";
	            } else {
	                assento.setOcupado(true);
	                return "Sucesso! Bom filme";
	            }
	        }
		}
		return "Erro: Assento inexistente";
	}
}
