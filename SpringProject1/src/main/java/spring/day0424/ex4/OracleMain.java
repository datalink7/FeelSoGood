package spring.day0424.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OracleMain {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("oracledb/oracleContext.xml");
		
		MyOracle my=(MyOracle)app.getBean("oracle");
		System.out.println(my);
	}

}
