package com.tassio_paulino.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		Empregados empr = contexto.getBean("vendedorExperiente", Empregados.class);
		System.out.println(empr.getTarefas());
		System.out.println(empr.getRelatorio());
		contexto.close();
	}
}
