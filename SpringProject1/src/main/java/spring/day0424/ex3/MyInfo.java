package spring.day0424.ex3;

import java.io.FileWriter;
import java.io.IOException;

public class MyInfo {
	private String name;
	private int java;
	private int jsp;
	private int spring;
	private String blood;
	
	MyInfo(String name, String blood)
	{
		this.name=name;
		this.blood=blood;
	}
	
	public void setJava(int java) {
		this.java = java;
	}
	
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	
	public void setSpring(int spring) {
		this.spring = spring;
	}
	
	public void fileWrite()
	{
		FileWriter fw=null;
		try {
			fw=new FileWriter("c:/spring0114/info.txt");
			fw.write("이름 :"+name+"\r\n");
			fw.write("혈액형 :"+blood+"\r\n");
			fw.write("Java점수 :"+java+"\r\n");
			fw.write("Jsp점수 :"+jsp+"\r\n");
			fw.write("Spring점수 :"+spring+"\r\n");
			System.out.println("파일에 정보를 저장했습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
