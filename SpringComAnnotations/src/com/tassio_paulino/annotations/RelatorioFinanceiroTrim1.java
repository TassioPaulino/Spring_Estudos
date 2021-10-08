package com.tassio_paulino.annotations;

import org.springframework.stereotype.Component;

@Component
public class RelatorioFinanceiroTrim1 implements ReportavelFinanceiro {

	@Override
	public String getRelatorioFinanceiro() {
	
		return "Apresentação do relatório financeiro do 1º trimestre.";
	}

}
