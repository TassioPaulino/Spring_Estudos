package com.tassio_paulino.IoC;

public class DiretorEmpregado implements Empregados {
	
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
	
	public void initMetodo() {
		System.out.println("O container Spring acabou de ser construido...");
	}
	
	public void destroyMetodo() {
		System.out.println("O container Spring está prestes a ser fechado.");
	}

}
