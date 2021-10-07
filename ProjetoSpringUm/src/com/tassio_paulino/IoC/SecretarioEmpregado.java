package com.tassio_paulino.IoC;

public class SecretarioEmpregado implements Empregados {
	
	private Reportavel novoRelatorio;
	
	public void setNovoRelatorio(Reportavel novoRelatorio) {
		this.novoRelatorio = novoRelatorio;
	}

	/*
	 * public SecretarioEmpregado(Reportavel novoRelatorio) { this.novoRelatorio =
	 * novoRelatorio; }
	 */

	@Override
	public String getTarefas() {
		return "Administro a agenda do Gerente. ";
	}

	@Override
	public String getRelatorio() {
		// TODO Auto-generated method stub
		return "Relat�rio gerado pelo SECRET�RIO:\n    " + novoRelatorio.getRelatorio() + "\n";
	}

}
