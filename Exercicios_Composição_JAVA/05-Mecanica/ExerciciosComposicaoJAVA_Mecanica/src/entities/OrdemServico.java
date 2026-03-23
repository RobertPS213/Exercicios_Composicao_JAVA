package entities;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import entities.enums.*;

public class OrdemServico {
	private LocalDate data;
	private StatusOrdem status;
	private List<Servico> listaServicos = new ArrayList<>();
	
	public OrdemServico() {
		
	}
	public OrdemServico(LocalDate data, StatusOrdem status) {
		this.data = data;
		this.status = status;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public StatusOrdem getStatus() {
		return status;
	}
	public void setStatus(StatusOrdem status) {
		this.status = status;
	}
	public List<Servico> getListaServicos() {
		return listaServicos;
	}
	public void addServico(Servico servico) {
		listaServicos.add(servico);
	}
	public void removeServico(Servico servico) {
		listaServicos.add(servico);
	}
	public double CalcularTotalGeral() {
		double totalGeral = 0.0;
	    for (Servico s : listaServicos) {
	        totalGeral += s.calcularTotalServico(); 
	    }
	    return totalGeral;
	}
}
