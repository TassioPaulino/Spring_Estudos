package com.tassio_paulino.annotations;

import org.springframework.stereotype.Component;

@Component("Vendedor")
public class Vendedor implements Empregados {

	@Override
	public String getTarefas() {
		// TODO Auto-generated method stub
		return "Vender os produtos da empresa.";
	}

	@Override
	public String getRelatorio() {
		// TODO Auto-generated method stub
		return "Relatório gerado pelo vendedor. ";
	}

}
