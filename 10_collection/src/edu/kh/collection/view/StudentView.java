package edu.kh.collection.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import edu.kh.collection.model.service.StudentService;

public class StudentView {

	// 필드
	private Scanner sc = new Scanner(System.in);
	
	private StudentService service = new StudentService();
	
	
	public void displayMenu()	{
		
		int input = 0;
		
		do {
			System.out.println("\n========== 학생 관리 프로그램 ==========\n");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			
			System.out.println("0. 프로그램 종료");
			
			try { 
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(input) {
			case 1 : addStudent(); break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 6 : break;
			case 0 : System.out.println("프로그램 종료"); break;
			
			default : System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println();
			
			} catch(InputMismatchException e) {
				System.out.println("[Error] 입력 형식이 유효하지 않습니다. \n");
				
				input = -1; // 첫 반복시 입력된 경우 while문이 종료되지 않도록 하는 값
				sc.nextLine(); // 입력 버퍼에남아있는 잘못된 문자열을 꺼내와 제거
			}
			
		} while(input != 0);
		
		
		
		
	}
	
	 /**
	 * 1. 학생 정보 추가 메서드
	 */
	public void addStudent() {
		 System.out.println("===== 학생 정보 추가 =====");
		 
		 // 이름, 나이, 주소, 성별(M/F), 점수
		 System.out.print("이름 : ");
		 String name = sc.next();
		 
		 System.out.print("나이 : ");
		 int age= sc.nextInt();
		 sc.nextLine(); // 입력버퍼 개행문자 제거
		 
		 System.out.print("주소 : ");
		 String address = sc.nextLine();
		 
		 char gender;
		 
		 while(true) {
		 System.out.print("성별(M/F) : ");
		 gender = sc.next().toUpperCase().charAt(0);
		 //String.toUpperCase() : 문자열을 대문자로 변환
		 
		 // 유효성 검사
		 if(gender == 'M' || gender =='F') {
			 break; //제대로 입력했을 때만 멈추고 다음으로 넘어가겠다.
		 } else {
			 System.out.println("[Error] M / F만 입력해주세요.");
		 }
		 }
		 
		 System.out.print("점수 : ");
		 int score = sc.nextInt();
		 
		  //제대로 추가 됐으면 true 
		 if(service.addStudent(name,age,address,gender,score)) {
			 System.out.println("[추가 완료]");
		 } else {
			 System.out.println("[Error] 학생 정보 추가 실패");
		 }
		 
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
