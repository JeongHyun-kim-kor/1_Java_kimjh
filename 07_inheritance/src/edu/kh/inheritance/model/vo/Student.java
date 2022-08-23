package edu.kh.inheritance.model.vo;


public class Student extends Person {

	// 자식 Student클래스에
	// 부모 Person클래스의 멤버(필드,메서드)를 상송
	
	// extends: 확장하다
	// -> 자식이 자기의 멤버 + 부모의 멤버를 가지게 되어
	//    몸집이 커짐
	
	
//	private String name;
//	private int age;
	
	private int grade;
	private int classRoom;
	
	public Student() {
		// Person(); // 부모의 생성자는 상속 XX
				// 자식이 부모를 만들어낸다?
		super(); // super생성자 (공손한 요청느낌)
		// 부모의 생성자를 참조하기 위해서 사용하는 생성자
		// 자식 생성자 내부 첫번째 줄에만 작성 가능
		
		//  -> 자식 객체 생성지 내부에 
		//	   부모 객체를 생성할 때 사용한다.
		
		
		// -> 자식생성자 첫번째 줄에
//		super()생성자 미작성시 컴파일러가 자동  추가.
		
		//* 컴파일러가 자동
		// 1) extends Object, super(),. 기본생성자, this
	}	
	
	// 매개변수 생성자(자식의 매개변수 생성자)
	public Student(String name, int age, int grade, int classRoom) { 
		//상속받은 name과 age
		// 상속받은 자식도 부모의 private 필드 직접 접근 불가
//		this.name = name;
//		this.age = age;
		// 에러남!
		
		// 방법1. 부모의 getter/setter 이용
		
//		setName(name);
//		setAge(age);
	
		// 굳이 super. 참조변수를 쓴다면 밑에와 같이.
		super.setName(name);
		super.setAge(age);
		
		// 방법 2. super() 생성자 이용
//		super(name, age); //부모가 갖고있는 생성자중에서  매개변수 생성자
		
		
		
		
		this.grade = grade;
		this.classRoom = classRoom;
		
	}
	
	
//	public String getName() {
//		return name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	
	
	// Person으로부터 상속받은 introduce() 메서드 오버라이딩(재정의)
	
	
	
	@Override
	public void introduce() {
//		System.out.println("이름 : " + super.getName()); //부모의 getName, 부모의 introduce <이름,나이> 재정의중
//		System.out.println("나이 : " + super.getAge());  // >> 자식이 grade와 classRoom을 추가함
		// 중복제거
		super.introduce();
		
		
		System.out.println("학년 : " + this.getGrade());
		System.out.println("반 : " + this.getClassRoom());
	}
	
//	@Override
//	public void ex10()	{
//		//에러남 (없어서 에러)
//	}
	
	 /**  Annotation(@) : 컴파일러용 주석
	 *  -> 컴파일러에게 해당 코드가 무엇을 의미히나느지
	 *  아니면 해당 코드를 수행하기 전에 무엇을 해야하는지 등을 알려줌
	 *  
	 *  
	 *  @Override 
	 *  1) 컴파일러에게 해당 메서드는 오버라이딩 되었음을 알려줌
	 *  2) 오버라이딩이 가능한지, 잘못 작성되지않았는지 검사 
	 *  
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


