package spring.day0424.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SawonMain {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("appContext1.xml");
		
		Sawon s1=(Sawon)app.getBean("sawon");
		System.out.println(s1); //toString 자동 호출
	}

}
