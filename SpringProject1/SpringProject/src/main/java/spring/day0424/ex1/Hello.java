package spring.day0424.ex1;

public class Hello {
	String name;
	int age;
	
	public Hello() {
		System.out.println("디폴트 생성자 호출");
		this.name="홍길동";
		this.age=23;
	}
	
	public String getMessage()
	{
		return "내이름은 "+name+"이고 "+age+" 세 입니다.";
	}
}
