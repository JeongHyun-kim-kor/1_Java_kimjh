package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {

	public void ex1() {
		
		// break 문 : '가장 가까운' 반복문을 빠져 나가는 구문
		
		for(int i=1; i<10000; i++) {
			
			System.out.println(i);
			
//			 i가 20일 때 반복 종료
			if(i==20) {
				break;
			}
			
		}
		
		System.out.println("===================");
		
		for(int row = 1; row <=5; row ++) {
			
			for(int col = 1; col <= 30; col++) {
				System.out.printf("(%d , %d)", row,col);
				
				if(col == 3 ) { // 5행 3열
					break; // 가장 근접해있는 for문을 멈추게 한다.
				}
			}
			System.out.println();
			
			// 3행 3열
			if(row == 3) {
				break;
			}
			
		}
		
	}
	
	
	public void ex2() {
		
		// 0이 입력될 때 까지의 입력된 정수의 합 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) { // 조건식에 강제로 true 작성 == 무한 반복
			
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			//누적하기 전에 검사
			if(input == 0 ) {
				break;
			}
			
			sum += input; //누적
			
			
		}
		
		System.out.println("합계 : " + sum);
		// Unreachable code : 도달할 수 없는 코드 -> 해석이 될 수 없다.
		
		
		
		
	}
	
	
	public void ex3() {
		
		// "exit@" 문자열이 입력될 때까지 문자열 누적하기
		
		Scanner sc = new Scanner(System.in);
		
		String str = ""; //비여있는 문자열 
		
		System.out.println("=== 문자열 입력 (종료시 exit@ 입력) ===");
		while(true	) {
			
			String input = sc.nextLine(); // 한 줄 입력
			
			// 비교연산자는 보통 기본 자료형의 값 비교만 가능하다.
			// -> String은 기본 자료형 X 참조형이라고 한다.
			
			// -> 참조형은 A.equals(B) 으로 값을 비교할 수 있다.
			if(input.equals("exit@")) {
				break;
			}
			
			str += input + "\n"; // 누적
			
		}
		System.out.println(str);
		
	}
	
	// continue
	public void ex4() {
		
		// continue : 다음 반복으로 넘어감
		
		// 1부터 30까지 5의 배수를 제외하고 출력 (continue 사용)
		for(int i=1; i<=30;i++) {
			
			// 5의 배수는 contiunue 하고 증감식으로  >> i = 5 → 6
			if(i % 5 == 0) {
				continue; // 다음 반복으로 이동(증감식 부분으로 이동)
			}
			
			System.out.println(i);
		}
	}
	
	public void ex5() {
		// 1 ~ 100까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을 때 출력 후 반복을 멈춤
		// 1) 
		for(int i=1; i<=100; i++) {

			if(i == 40) {
				System.out.println(i);  //print구문을 한번 더 써서 40 출력
				break;
			} 
			
			if(i % 5 == 0) {
				
			continue;
			}
			
			System.out.println(i);
		}
	}
	
	
	public void upDownGame() {
		
		// 프로그램 시작 시 1 ~ 50 사이의 임의의 수 (난수)를 하나 생성하여
		// 사용자가 몇회 만에 맞추는지 count
		
		// 만약 틀렸을 경우 난수가 입력한 수보다 크면 UP / 작으면 DOWN 출력
		
		// (임의 수 30일 경우)
		
		// ex) 1번 입력 : 10 UP
		// 2번 입력 : 40 DOWN
		// 3번 입력 : 30 정답입니다. (총 입력횟수 : 3회)
		
		// 난수 생성 : Math.random()  -> Java에서 제공해주는 난수 생성 방법
		// 0.0 <= x < 1.0    0.0이상 1.0미만의 난수 생성(double 형)
		// 
		
		int ran = (int)(Math.random() * 50 + 1);
		
		// 0.0 <= x < 1.0
		// 0.0 <= x *50 < 50.0	    /// * 50
		// 1.0 <= x * 50 + 1< 51.0		// +1
		// 1 <= (int)(x *50 + 1) < 51 ----> 1 ~ 50사이의 난수
		//System.out.println(ran);
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		
		System.out.print(count+"번 입력 : ");
		int input = sc.nextInt();

		while(input != ran) {
			System.out.print(count+"번 입력 : ");
		}
		
			
//				if(input == ran) {
//					System.out.println("정답입니다.");
//					break;
//			    } else {
//					if(input < ran) {
//						System.out.println("DOWN");
//					} else {
//						System.out.println("UP");
//					}
//					count++;
//			}
			
//		}
		
		
		
		
		
		
	
	
	
	}
	
	
	
	
	
	
	
	
}
