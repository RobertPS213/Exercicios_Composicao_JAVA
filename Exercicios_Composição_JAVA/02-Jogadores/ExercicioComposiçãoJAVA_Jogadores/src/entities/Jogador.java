package entities;

import entities.enums.Posicao;

public class Jogador {
	private String nickname;
	private Posicao posicao;
	
	public Jogador(String nickname, Posicao posicao) {
		this.nickname = nickname;
		this.posicao = posicao;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Posicao getPosicao() {
		return posicao;
	}
	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
}
