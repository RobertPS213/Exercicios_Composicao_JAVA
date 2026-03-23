package entities;

import entities.enums.TipoAssento;

public class Assento {
	private int numero;
	private TipoAssento tipo;
	private boolean ocupado;
	
	public Assento() {
		
	}
	public Assento(int numero, TipoAssento tipo, boolean ocupado) {
		this.numero = numero;
		this.tipo = tipo;
		this.ocupado = ocupado;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public TipoAssento getTipo() {
		return tipo;
	}
	public void setTipo(TipoAssento tipo) {
		this.tipo = tipo;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
}
