package spring.day0424.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		System.out.println("** 자바에서의 클래스 생성과 로출 **");
		Hello h1=new Hello();
		System.out.println(h1.getMessage());
		
		Hello h2=new Hello();
		System.out.println(h2.getMessage());
		
		System.out.println("두 변수의 주소 비교");
		System.out.println(h1==h2);	//false 생성된 주소가 다르다 (집은 똑같은데 번지수가 다른 느낌적인 느낌
		
		System.out.println("** 스프링에서의 객체 생성 **");
		//어플리케이션 실행시에만 필요하다
		//웹으로 실행시 web.xml 에 설정되어 있으므로 필요없음
		ApplicationContext app=new ClassPathXmlApplicationContext("appContext1.xml");
		
		Hello h3=(Hello)app.getBean("hello");	//반환타입이 Object 이므로 형변환 필요
		System.out.println(h3.getMessage());
		
		//2번째 방법
		Hello h4=app.getBean("hello", Hello.class);
		System.out.println(h4.getMessage());
		//스프링은 기본 설정이 싱글톤이기 때문에
		//여러번 생성해도 주소가 같다.
		System.out.println(h3==h4);	//주소비교 true, 따라서 메모리 낭비가 없다?
	}

}
