package com.tassio_paulino.IoC;

public class DiretorEmpregado implements Empregados {
	
	private Reportavel novoRelatorio;
	
	
	public DiretorEmpregado(Reportavel novoRelatorio) {
		super();
		this.novoRelatorio = novoRelatorio;
	}

	@Override
	public String getTarefas() {
		return "Dirijo um setor da empresa.";
	}

	@Override
	public String getRelatorio() {
		return "Relatório gerado pelo DIRETOR:\n    " + novoRelatorio.getRelatorio() + "\n";
	}

}
