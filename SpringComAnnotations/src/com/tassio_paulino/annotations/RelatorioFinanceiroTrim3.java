package com.tassio_paulino.annotations;

import org.springframework.stereotype.Component;

@Component
public class RelatorioFinanceiroTrim3 implements ReportavelFinanceiro {

	@Override
	public String getRelatorioFinanceiro() {
		// TODO Auto-generated method stub
		return "Apresenta��o do relat�rio favor�vel do 3� trimestre.";
	}

}
