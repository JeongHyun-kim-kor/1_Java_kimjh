package edu.kh.objectarray.view;

import java.util.Scanner;

import edu.kh.objectarray.model.service.Service;

public class View {

	private Service service = new Service();
	
	private Scanner sc = new Scanner(System.in);

	public void displayMenu() {
		
		int input = 0;
		
		do {
			System.out.println("----- [학생 관리 프로그램 -----");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 전체 정보 조회");
			System.out.println("3. 학생 1명 정보 조회(인덱스)");
			System.out.println("4. 학생 1명 정보 조회(이름 검색)");
			System.out.println("5. 학생 정보 수정(인덱스)");     // 점수 수정
			System.out.println("0. 종료");
			
			
			System.out.println("--------------------------");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			switch(input) {
			case 1: addStudent(); break;
			case 2: printAll(); break;
			case 3: selectIndex(); break;
			case 4: selectName(); break;
			case 5: updateStudent(); break;    // 점수 수정
			case 0: System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력 하셨습니다.");
			}
			
			System.out.println();

		} while(input != 0);
	}
	
		public void adStudent() {
			
	
	
	
	
	
		}
	}
}
