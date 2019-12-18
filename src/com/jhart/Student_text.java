package com.jhart;

public class Student_text {

	public static void main(String[] args) {
		//
		// TODO 自动生成的方法存根
		Student s1=new Student();
		s1.setName("mike");
		s1.setScore(600);
		Student s2=new Student("maria",560);
		System.out.println(s1.getName()+"考了"+s1.getScore()+"分");
		System.out.println(s2.getName()+"考了"+s2.getScore()+"分");
		
		couse c1=new couse();
		c1.setCouse_name("JAVA程序设计");;
		c1.setCouse_book("JAVA入门基础");;
		System.out.println(c1.getCouse_name()+"这门课使用的教材是《"+c1.getCouse_book()+"》");
	}
		
}
