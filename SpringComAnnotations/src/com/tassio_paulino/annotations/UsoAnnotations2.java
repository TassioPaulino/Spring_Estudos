package com.tassio_paulino.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empregados maria = contexto.getBean("vendedorExperiente", Empregados.class);
		Empregados antonio = contexto.getBean("vendedorExperiente", Empregados.class);
		
		if(maria == antonio) {
			System.out.println("Apontam ao mesmo lugar em memória.");
			System.out.println(maria +"\n"+ antonio);
		} else {
			System.out.println("NÃO apontam para o mesmo local de memória.");
			System.out.println(maria +"\n"+ antonio);
		} 
		
		contexto.close();
	}

}
