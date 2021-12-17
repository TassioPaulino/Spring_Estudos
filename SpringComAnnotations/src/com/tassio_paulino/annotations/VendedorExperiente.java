package com.tassio_paulino.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class VendedorExperiente implements Empregados {

	@Autowired
	@Qualifier("relatorioFinanceiroTrim4")
	private ReportavelFinanceiro novoRelatorio;
	
	/*
	 * @Autowired public VendedorExperiente(ReportavelFinanceiro novoRelatorio) {
	 * this.novoRelatorio = novoRelatorio; }
	 */

	/*
	 * @Autowired public void setNovoRelatorio(ReportavelFinanceiro novoRelatorio) {
	 * this.novoRelatorio = novoRelatorio; }
	 */
	@PostConstruct
	public void executaDepoisDaCriacao() {
		System.out.println("Executado depois da criação do Bean.");
	}
	
	@PreDestroy
	public void executaAntesDaDestruicao() {
		System.out.println("Executado antes da destruição do Bean.");
	}
	
	@Override
	public String getTarefas() {
		// TODO Auto-generated method stub
		return "Vender os produtos da empresa.";
	}

	@Override
	public String getRelatorio() {
		// TODO Auto-generated method stub
		return novoRelatorio.getRelatorioFinanceiro();
	}

}
