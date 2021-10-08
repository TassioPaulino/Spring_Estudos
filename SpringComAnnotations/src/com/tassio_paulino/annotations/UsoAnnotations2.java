package com.tassio_paulino.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empregados maria = contexto.getBean("vendedorExperiente", Empregados.class);
		Empregados antonio = contexto.getBean("vendedorExperiente", Empregados.class);
		
		if(maria == antonio) {
			System.out.println("Apontam ao mesmo lugar em mem�ria.");
			System.out.println(maria +"\n"+ antonio);
		} else {
			System.out.println("N�O apontam para o mesmo local de mem�ria.");
			System.out.println(maria +"\n"+ antonio);
		} 
		
		contexto.close();
	}

}
