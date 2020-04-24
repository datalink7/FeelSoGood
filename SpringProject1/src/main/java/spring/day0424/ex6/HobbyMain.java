package spring.day0424.ex6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.day0424.ex6.Hobby;

public class HobbyMain {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("appContext1.xml");
		
		Hobby hobby=(Hobby)app.getBean("hobby");
		hobby.write();
		//hobby.list.forEach(h->System.out.println(h));
	}

}
