package edu.kh.objectarray.model.vo;

// 값 저장용 클래스
// -> 객체로 만들어진 후 값을 저장하는 용도와 객체로 사용(데이터 관리)
public class Student {
	private int grade; // 학년
	private int classRoom; //반
	private int number; // 번호
	private String name; // 이름
	
	private int kor; //국어 점수
	private int eng; // 영어 점수
	private int math; // 수학 점수
	
	// 기본 생성자
	public Student() {}
	
	// 매개변수 생성자 (4개짜리, 7개짜리 2종류)
	// 오버로딩 적용
	public Student(int grade, int classRoom, int number, String name) {
	
		// this 참조변수
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
		this.name = name;
	}
	
	// 매개변수 생성자
	// 오버로딩 적용
	public Student(int grade, int classRoom, int number, String name,
				   int kor, int eng, int math) {
		
		// this 참조변수
//		this.grade = grade;
//		this.classRoom = classRoom;
//		this.number = number;
//		this.name = name;
		this(grade, classRoom, number, name);
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// alt + (shift) + s 또는 Source 메뉴 
	// -> r (generate Getters and setters)
	//getter / setter
	public int getGrade() {
		return grade;
	}
	
	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	

}
