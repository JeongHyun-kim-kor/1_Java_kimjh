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
	
	public int login(String id, String pw, UserReview user) { // 입력된 id값 pw값
		
		
		
		if(user == null	) { // 가입을 아직 안했다.
			return -1;
		} else { // 가입은 했음
			if(user.getUserId().equals(id) && user.getUserPw().equals(pw)){
				// 로그인 성공
				return 1;
			} else { //하나라도 다름 > 로그인 실패
				return 0;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
