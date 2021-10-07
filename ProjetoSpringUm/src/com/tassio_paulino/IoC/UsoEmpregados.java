package com.tassio_paulino.IoC;

import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpregados {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empregados e1 = contexto.getBean("meuEmpregado", Empregados.class);
		System.out.println(e1.getTarefas());
		contexto.close();
	}	
}
