package spring.day0424.ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.day0424.ex3.MyInfo;

public class CartMain {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("appContext1.xml");
		
		Cart cart=(Cart)app.getBean("cart");
		cart.wirte();
	}

}
