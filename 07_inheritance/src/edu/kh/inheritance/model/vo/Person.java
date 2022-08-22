package edu.kh.inheritance.model.vo;

public class Person {

	private String name;
	private int age;
	
	// ctrl + space bar + enter
	public Person() {
		// TODO Auto-generated constructor stub
	}

	// alt + s -> o 또는 alt + shift + s + o
	// 매개변수 생성자 
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age =age;
	}
	
}
