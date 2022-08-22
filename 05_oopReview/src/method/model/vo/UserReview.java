package method.model.vo;

// VO (Value Object) : 값 저장용 객체를 만들기 위한 클래스
public class UserReview {

	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
public UserReview() {
	// TODO Auto-generated constructor stub
}	
	//setter : 매개 변수로 전달 받을 값을 필드에 대입(세팅)

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getUserPw() {
	return userPw;
}

public void setUserPw(String userPw) {
	this.userPw = userPw;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public int getUserAge() {
	return userAge;
}

public void setUserAge(int userAge) {
	this.userAge = userAge;
}

public char getUserGender() {
	return userGender;
}

public void setUserGender(char userGender) {
	this.userGender = userGender;
}
	
}
