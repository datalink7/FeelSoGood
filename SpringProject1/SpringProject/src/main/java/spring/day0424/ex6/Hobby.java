package spring.day0424.ex6;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
	String name;
	List<String> list=new ArrayList<String>();
	
	public Hobby(String name, ArrayList<String> list) {
	// TODO Auto-generated constructor stub
		this.name=name;
		this.list=list;
	}
	
	public void write() {
		System.out.println("이름 : "+name);
		System.out.println("** 나의 취미들 **");
		list.forEach(h->System.out.println(h));
	}
}
