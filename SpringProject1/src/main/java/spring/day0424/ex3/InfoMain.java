package spring.day0424.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InfoMain {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("setting/infoContext.xml");
		
		MyInfo my=(MyInfo)app.getBean("info");
		my.fileWrite();
	}

}
