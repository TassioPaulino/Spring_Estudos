package com.tassio_paulino.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		SecretarioEmpregado maria = contexto.getBean("meuSecretario", SecretarioEmpregado.class);
		SecretarioEmpregado pedro = contexto.getBean("meuSecretario", SecretarioEmpregado.class);
		
		System.out.println(maria);
		System.out.println(pedro);
		
		if(maria == pedro) System.out.println("Apontam ao mesmo objeto.");
		else System.out.println("Não se tratam do mesmo objeto. ");
		
		contexto.close();
	}

}
