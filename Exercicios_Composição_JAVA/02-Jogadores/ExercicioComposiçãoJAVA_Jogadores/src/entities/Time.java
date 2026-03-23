package entities;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nomeTime;
	private List<Jogador> jogadores = new ArrayList<>();
	
	public Time() {
		
	}
	
	public Time(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	public void addJogador(Jogador jogador) {
		jogadores.add(jogador);
	}
	public void removeJogador(Jogador jogador) {
		jogadores.remove(jogador);
	}
	public String adicionarJogador(Jogador novoJogador) {
		boolean posicaoOcupada = false;
		for(Jogador jogador: jogadores) {
			if(jogador.getPosicao() == novoJogador.getPosicao()) {
				posicaoOcupada = true;
				break;
			}
		}
		if(posicaoOcupada) {
			return "Erro: a posição " + novoJogador.getPosicao() + " já está ocupada!";
		} else {
			jogadores.add(novoJogador);
	        return "Jogador " + novoJogador.getNickname() + " adicionado com sucesso!";
		}
	}
	public String exibirEscalação() {
		StringBuilder sb = new StringBuilder();
		for(Jogador jogador: jogadores) {
			sb.append("Nome do Jogador: " + jogador.getNickname() + "\n");
			sb.append("Posição do Jogador: " + jogador.getPosicao() + "\n");
		}
		return sb.toString();
	}
}
