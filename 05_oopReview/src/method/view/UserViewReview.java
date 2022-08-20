package method.view;

import java.util.Scanner;

import method.model.service.UserServiceReview;

public class UserViewReview {

	Scanner sc = new Scanner(System.in);
	
	UserServiceReview service = new UserServiceReview();
	// 메뉴 출력
	
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
		
		}
	
	
	
	
	
	
	
	
	
	
	
}
