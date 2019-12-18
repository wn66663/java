package com.jhart;

public class Student extends Person {
	private int score;//成绩属性
	//读姓名
	public Student() {}
	public Student(String xm,int cj) {
		this.name=xm;
		this.score=cj;
	}
	public String getName() {
		return name;
	}
	//写姓名
	public void setName(String name) {
		this.name = name;
	}
	//读成绩
	public int getScore() {
		return score;
	}
	//写成绩
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
