package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Sample s = context.getBean("sample",Sample.class);
		
		System.out.println(s);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression exp = temp.parseExpression("23+37");
		System.out.println(exp.getValue());
	}
}
