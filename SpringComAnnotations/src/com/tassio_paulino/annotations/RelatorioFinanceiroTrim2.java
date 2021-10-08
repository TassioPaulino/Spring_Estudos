package com.tassio_paulino.annotations;

import org.springframework.stereotype.Component;

@Component
public class RelatorioFinanceiroTrim2 implements ReportavelFinanceiro {

	@Override
	public String getRelatorioFinanceiro() {
		// TODO Auto-generated method stub
		return "Apresentação do relatorio catastrófico do 2º trimestre.";
	}

}
