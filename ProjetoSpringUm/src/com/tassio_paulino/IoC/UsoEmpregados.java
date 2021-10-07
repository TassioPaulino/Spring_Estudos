package com.tassio_paulino.IoC;

import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpregados {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ArrayList<Empregados> empregados = new ArrayList<Empregados>();
		empregados.add(contexto.getBean("meuDiretor", Empregados.class));
		empregados.add(contexto.getBean("meuGerente", Empregados.class));
		empregados.add(contexto.getBean("meuSecretario", Empregados.class));
		
		for(int i = 0; i < empregados.size(); i++) {
			System.out.println(empregados.get(i).getTarefas());
			System.out.println(empregados.get(i).getRelatorio());
		}
		
		contexto.close(); 
	}	
}
