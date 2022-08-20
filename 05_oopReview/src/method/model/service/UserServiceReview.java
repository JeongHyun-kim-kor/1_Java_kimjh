package method.model.service;

import method.model.vo.UserReview;

public class UserServiceReview {

	public UserReview signUp(String userId, String userPw, String userName, int userAge, char userGender) {
		
		UserReview u = new UserReview();
		
		u.setUserId(userId);
		u.setUserPw(userPw);
		u.setUserName(userName);
		u.setUserAge(userAge);
		u.setUserGender(userGender);
		return u;
	}
}
