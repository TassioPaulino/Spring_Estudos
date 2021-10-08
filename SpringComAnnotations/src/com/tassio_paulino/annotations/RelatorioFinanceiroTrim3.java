package com.tassio_paulino.annotations;

import org.springframework.stereotype.Component;

@Component
public class RelatorioFinanceiroTrim3 implements ReportavelFinanceiro {

	@Override
	public String getRelatorioFinanceiro() {
		// TODO Auto-generated method stub
		return "Apresentação do relatório favorável do 3º trimestre.";
	}

}
