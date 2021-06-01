package com.cts.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("C:\\Users\\alka0\\workspace\\mvn-ecl-jv-spring\\src\\resources\\auto-beans.xml");
		Line line=(Line) context.getBean("line");
		
		line.drawLine();
		System.out.println(line.getA().getX()+"............."+line.getA().getY());

	}

}
