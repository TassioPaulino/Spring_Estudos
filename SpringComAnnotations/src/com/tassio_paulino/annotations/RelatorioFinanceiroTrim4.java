package com.tassio_paulino.annotations;

import org.springframework.stereotype.Component;

@Component
public class RelatorioFinanceiroTrim4 implements ReportavelFinanceiro {

	@Override
	public String getRelatorioFinanceiro() {
		// TODO Auto-generated method stub
		return "Apresentação do relátorio de fechamento do ano.";
	}

}
