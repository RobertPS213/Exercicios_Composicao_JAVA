package entities;

import java.util.*;

public class Voo {
	private String codigoVoo;
	private int capacidadeMaxima;
	private List<Passageiro> listaPassageiro = new ArrayList<>();
	
	public Voo() {
		
	}
	public Voo(String codigoVoo, int capacidadeMaxima) {
		this.codigoVoo = codigoVoo;
		this.capacidadeMaxima = capacidadeMaxima;
	}
	public String getCodigoVoo() {
		return codigoVoo;
	}
	public void setCodigoVoo(String codigoVoo) {
		this.codigoVoo = codigoVoo;
	}
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	public List<Passageiro> getListaPassageiros() {
		return listaPassageiro;
	}
	public String embarcar(Passageiro p) {
		for(Passageiro pas: listaPassageiro) {
			if(p.getPassaporte().equalsIgnoreCase(pas.getPassaporte())) {
				return "Erro: Passageiro já embarcado! (Passaporte sendo usado por " + pas.getName() + ")";
			}
		}
		if(listaPassageiro.size() >= capacidadeMaxima) {
			return "> Erro: Voo Lotado!";
		} else {
			listaPassageiro.add(p);
			return "> Embarque Autorizado: " + p.getName();
		}
	}
	public String listarPassageiros() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < listaPassageiro.size(); i++) {
			sb.append("--- " + (i + 1) + " Passageiro ---\n");
			sb.append("Nome do passageiro: ");
			sb.append(listaPassageiro.get(i).getName());
			sb.append("\nPassaporte: ");
			sb.append(listaPassageiro.get(i).getPassaporte());
			sb.append("\n");
		}
		return sb.toString();
	}
}
