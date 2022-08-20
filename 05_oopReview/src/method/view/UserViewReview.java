package method.view;

import java.util.Scanner;

import method.model.service.UserServiceReview;
import method.model.vo.UserReview;

public class UserViewReview {

	Scanner sc = new Scanner(System.in);
	
	UserServiceReview service = new UserServiceReview();
	// 메뉴 출력
	
	//1. 화원가입
	private UserReview user = null;
	
	// 2. 로그인()
	private UserReview loginUser = null;
	// null인 경우 == 로그인 X
	// null이 아닌경우 == 로그인 O
	
	public void displayMenu()	{
		
	int input = 0; // 메뉴 번호 입력
	
	do {
		System.out.println("---------- 사용자 기능 메뉴 ----------");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 로그아웃");
		System.out.println("4. 회원 정보 출력");
		System.out.println("5. 회원 정보 수정");
		System.out.println("0. 프로그램 종료");
		System.out.println("----------------------------------");
		System.out.print("메뉴 입력 >> ");
		input = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		switch(input) {
		
		case 1 : signUp() ; break;
		case 2 : login(); break;
		case 3 : ; break;
		case 4 : ; break;
		case 5 : ; break;
		case 0 : ; break;
		default : System.out.println("잘못 입력하셨습니다. ");
		}
		
	}  while(input !=0);
	}
	
	// 회원 가입 정보를 입력받을 메서드
	public void signUp() {
		
		System.out.println("회원가입");
		
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age =  sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		service.signUp(id, pw, name, age, gender);
		
		
		System.out.println("회원 가입 완료");
	}
	
		public void login() {
			
			System.out.println("[로그인]");
			
			if(loginUser != null) {
				System.out.println("이미 로그인 상태이빈다.");
			} else {
				System.out.print("아이디 : ");
				String id = sc.next();
				
				System.out.print("비밀번호 : ");
				String pw = sc.next();
				
					int result = service.login(id, pw, user	);//로그인 서비스 호출
					// -1 , 0 , 1
					
					if(result == -1) {
						System.out.println("회원 가입 후 시도해주세요");
						 
					} else if(result ==0) {
						System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
					} else {
						System.out.println("로그인 성공");
						loginUser = user;
					}
			}
			
		}
	
	
	
	
	
	
	
	
	
	
	
}
