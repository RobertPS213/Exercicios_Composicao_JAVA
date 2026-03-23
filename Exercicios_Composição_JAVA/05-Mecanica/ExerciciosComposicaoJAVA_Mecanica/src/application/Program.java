package application;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Locale;
import java.time.format.DateTimeFormatter;
import entities.enums.*;
import entities.*;

public class Program {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("--- OFICINA MECÂNICA ---");
		System.out.print("Data: ");
		String dataStr = sc.nextLine();
		LocalDate data = LocalDate.parse(dataStr, fmt);
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("Quantos serviços foram realizados: ");
		int x = sc.nextInt();
		OrdemServico ordemServico = new OrdemServico(data, StatusOrdem.valueOf(status));
		for(int i = 0; i < x; i++) {
			sc.nextLine();
			System.out.print("\nServiço #" + (i + 1) + ":");
			System.out.print("\nDescrição: ");
			String descricao = sc.nextLine();
			System.out.print("Valor da Mão de Obra: ");
			double valorMaoDeObra = sc.nextDouble();
			Servico servico = new Servico(descricao, valorMaoDeObra);
			System.out.print("Quantas peças foram usadas nesse serviço: ");
			int y = sc.nextInt();
			for(int j = 0; j < y; j++) {
				sc.nextLine();
				System.out.print("\nPeça #" + (j + 1) + ":");
				System.out.print("\nNome: ");
				String nomePeca = sc.nextLine();
				System.out.print("Preço: ");
				double precoPeca = sc.nextDouble();
				servico.addPeca(new Peca(nomePeca, precoPeca));
			}
			ordemServico.addServico(servico);
		}
		
		sb.append("\n--- RESUMO DA ORDEM ---\n");
		sb.append("Data: ").append(ordemServico.getData().format(fmt)).append(" | ");
		sb.append("Status: ").append(ordemServico.getStatus()).append("\n");
		for (Servico s : ordemServico.getListaServicos()) {
		    sb.append("\nServiço: ").append(s.getDescricao()).append("\n");
		    sb.append("Custo Total do Serviço: ")
		      .append(String.format("%.2f", s.calcularTotalServico()))
		      .append(" ")
		      .append(s.getDetalhamentoPrecos())
		      .append("\n");
		}
		sb.append("\n------------------------------\n");
		sb.append("TOTAL GERAL DA ORDEM: R$ ")
		  .append(String.format("%.2f", ordemServico.CalcularTotalGeral()));
		System.out.println(sb.toString());
	}
}
