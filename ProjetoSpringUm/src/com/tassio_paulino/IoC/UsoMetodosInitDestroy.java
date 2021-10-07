package com.tassio_paulino.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoMetodosInitDestroy {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		Empregados joao = contexto.getBean("meuDiretor", Empregados.class);
		System.out.println(joao.getRelatorio());
		contexto.close();

	}

}
