package com.tassio_paulino.IoC;

public class GerenteEmpregado implements Empregados {

	private Reportavel novoRelatorio;
	private String email;
	private String nomeDaEmpresa;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}

	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}
	
	public void setNovoRelatorio(Reportavel novoRelatorio) {
		this.novoRelatorio = novoRelatorio;
	}
	
	public GerenteEmpregado(Reportavel novoRelatorio) {
		this.novoRelatorio = novoRelatorio;
	}

	@Override
	public String getTarefas() {
		return "Gerencio as questões relativas ao empregados da minha sessão";
	}

	@Override
	public String getRelatorio() {
		// TODO Auto-generated method stub
		return "Relatório gerado pelo GERENTE:\n    " + novoRelatorio.getRelatorio() + "\n";
	}
	
}
