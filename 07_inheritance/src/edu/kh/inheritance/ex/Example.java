package edu.kh.inheritance.ex;

import edu.kh.inheritance.model.vo.Student;

public class Example {

	public void ex1() {
		
		// 상속 확인
		
		// Student 객체 생성(자식)
		Student s1 = new Student();
		
		// 자식만의 기능/필드(grade, classRoom)
		s1.setGrade(2); //setGrade(int grade) : void - Student(Student의 원래 메서드)
		s1.setClassRoom(3); // grade와 동일
		
		s1.setName("김개똥"); // setname(String name) : void - Person (Person의 메서드)
							// -> 부모인 person으로 부터 상속 받은 메서드라는 뜻
		s1.setAge(15);
		
		System.out.println(s1.getGrade());
		System.out.println(s1.getClassRoom());
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
	}
}
