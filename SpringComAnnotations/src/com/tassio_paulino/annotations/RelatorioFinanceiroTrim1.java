package com.tassio_paulino.annotations;

import org.springframework.stereotype.Component;

@Component
public class RelatorioFinanceiroTrim1 implements ReportavelFinanceiro {

	@Override
	public String getRelatorioFinanceiro() {
	
		return "Apresenta��o do relat�rio financeiro do 1� trimestre.";
	}

}
