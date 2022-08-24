package edu.kh.inheritance.model.vo;

public class Child extends Parent {

	
	public void method1() {
		//Cannot override the final method from Parent
		System.out.println("자식의 메서드");
		
	}
	
}
