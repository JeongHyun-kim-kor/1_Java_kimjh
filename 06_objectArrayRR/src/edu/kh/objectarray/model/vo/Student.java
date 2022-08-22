package edu.kh.objectarray.model.vo;

public class Student {

	private int grade; 
	private int classRoom;
	private int number;
	private String name;
	
	private int kor;
	private int eng;
	private int math;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int grade, int classRoom, int number, String name) {
		
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
		this.name = name;
		
	}
	
	public Student(int grade, int classRoom, int number, String name,
			int kor, int eng, int math	) {
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
		this.name= name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	
}
