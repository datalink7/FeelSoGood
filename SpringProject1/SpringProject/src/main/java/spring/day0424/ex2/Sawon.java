package spring.day0424.ex2;

public class Sawon {
	String name;
	String hp;
	String addr;
	
	public Sawon(String name, String hp, String addr) {
		super();
		this.name = name;
		this.hp = hp;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Sawon [name=" + name + ", hp=" + hp + ", addr=" + addr + "]";
	}
	
	
	
}
