package entities;

import java.util.List;
import java.util.ArrayList;

public class Servico {
	private String descricao;
	private Double ValorMaoDeObra;
	private List<Peca> listaPecas = new ArrayList<>();
	
	public Servico() {
		
	}
	public Servico(String descricao, Double valorMaoDeObra) {
		this.descricao = descricao;
		ValorMaoDeObra = valorMaoDeObra;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValorMaoDeObra() {
		return ValorMaoDeObra;
	}
	public void setValorMaoDeObra(Double valorMaoDeObra) {
		ValorMaoDeObra = valorMaoDeObra;
	}
	public List<Peca> getListaPecas() {
		return listaPecas;
	}
	public void addPeca(Peca peca) {
		listaPecas.add(peca);
	}
	public void removePeca(Peca peca) {
		listaPecas.add(peca);
	}
	public String getDetalhamentoPrecos() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("(");
	    sb.append(String.format("%.2f", ValorMaoDeObra));
	    
	    for (Peca p : listaPecas) {
	        sb.append(" + ").append(String.format("%.2f", p.getPreco()));
	    }
	    
	    sb.append(")");
	    return sb.toString();
	}
	public double calcularTotalServico() {
		double sum = 0.0;
		for(Peca peca: listaPecas) {
			sum += peca.getPreco();
		}
		return sum + ValorMaoDeObra;
	}
}
