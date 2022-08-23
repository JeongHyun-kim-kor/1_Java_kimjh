package edu.kh.inheritance.model.vo;

public class Person extends Object {
	
	//extends Object -> 상속 구문이 작성되지 않으면 
//					   컴파일러가 자동 추가
	
	private String name;
	private int age;
	
	// ctrl + space bar + enter : 기본 생성자
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
	
	
	
	
	// 0823 2교시
	
	// 자기소개 기능
	public void introduce() {
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
