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
			
			} catch(InputMismatchException e) {
				System.out.println("[Error] 입력 형식이 유효하지 않습니다. \n");
				
				input = -1; // 첫 반복시 입력된 경우 while문이 종료되지 않도록 하는 값
				sc.nextLine(); // 입력 버퍼에남아있는 잘못된 문자열을 꺼내와 제거
			}
			
		} while(input != 0);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
