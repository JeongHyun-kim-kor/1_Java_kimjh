package edu.kh.oop.method.model.vo;

public class User {

	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	public User() {} // 기본생성자
	
	//setter
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	public void setUserName(String userName) {
		this.userName =userName;
	}
	
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	
	
	//getter
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserPw() {
		return userPw;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getUserAge() {
		return userAge;
	}
	
	public char getUserGender() {
		return userGender;
	}
	
	
	
	
	
	
	
	
	
}
