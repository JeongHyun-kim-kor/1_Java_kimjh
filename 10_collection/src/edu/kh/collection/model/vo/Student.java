package edu.kh.collection.model.vo;

public class Student {

	private String name;
	private int age;
	private String address;
	private char gender;
	private int score;
	
	public Student() {
	
	}

	public Student(String name, int age, String address, char gender, int score) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.score = score;
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
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// Object.toString() 오버라이딩
	// alt + shift + s -> s -> enter
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", gender=" + gender + ", score="
				+ score + "]";
	}
	
	
	
	
}
