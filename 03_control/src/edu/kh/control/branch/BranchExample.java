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
		
//		System.out.print(count+"번 입력 : ");

		//선생님
		while(true) {
			System.out.print(count+"번 입력 : " );
			int input = sc.nextInt();

			// 난수 == 입력값이 같을 때 
			
			// 난수 > 입력값
			
			// 난수 < 입력값
			
			if(ran == input) { // 난수 == 입력값이 같을 때 
				System.out.printf("정답 입니다! (총 입력 횟수 : %d회) \n", count);
				break; // while문 종료
				
			} else if(ran > input) { 			// 난수 > 입력값
				System.out.println("UP");
				
			} else { // 난수 < 입력값
				System.out.println("DOWN");
				
			}
			
			
			count++;
		}
		
		
		
		
//		while(count<=10) {
//			
//			System.out.print(count+"번 입력 : ");
//			
//			count += 1;
//			
//			if(input == ran) {
//				System.out.println("정답입니다. (총 입력횟수 : )"+ count +"회");
//				break;
//		    } else {
//		    	while(input != ran) {
//				if(input < ran) {
//					System.out.println("DOWN");
//				} else {
//					System.out.println("UP");
//				}
//		    	}
//		}
		
			
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
//		}
		
		
		
		
		
	
	
	}

	
	public void rspGame() {
		// 가위 바위 보 게임
		   
		   // 몇판? : 3
		   
		   // 1번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  가위
		   // 컴퓨터는 [보]를 선택했습니다.
		   // 플레이어 승!
		   // 현재 기록 : 1승 0무 0패
		   
		   // 2번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  보
		   // 컴퓨터는 [보]를 선택했습니다.
		   // 비겼습니다.
		   // 현재 기록 : 1승 1무 0패
		   
		   // 3번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  가위
		   // 컴퓨터는 [바위]를 선택했습니다.
		   // 졌습니다ㅠㅠ
		   // 현재 기록 : 1승 1무 1패
//		int rsp = (int)(Math.random() * 3);
	    // ---> 0 / 1 / 2
		// 0 -> 가위 1 -> 바위 2 ->보
//		String rsp2 = "";
		
//		if(rsp == 0) {
//			rsp2 = "가위";
//		} else if ( rsp == 1) {
//			rsp2 = "바위";
//		} else if ( rsp == 2) {
//			rsp2 = "보";
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇판? : ");
			int input = sc.nextInt();
			
		//	int count = 1;
			int v =0; // 승
			int d =0; // 무
			int f =0; // 패
		
		
		
		for(int i = 1 ; i <=input ; i++) {
		System.out.print(i+"번째 게임 \n");

		System.out.print("가위/바위/보 중 하나를 입력 해주세요 : ");
		
		String player = sc.next();
		
		// 컴퓨터 가위바위보 지정
		int ran = (int)(Math.random() * 3);

		String com = "";  // 이걸로 해도 되나
//		String rsp2 = null;
		// null : 없다(비슷)
		
		// null ; //참조 X
//		  ""      // 빈 문자열
		
//		
		// 0 , 1 , 2 를 String으로 변환해서 가위바위보로 
//		if(rsp == 0) {
//			rsp2 = "가위";
//		} else if ( rsp == 1) {
//		rsp2 = "바위";
//		} else if ( rsp == 2) {
//			rsp2 = "보";
//		}
		
		 switch(ran) {
		 case 0 : com = "가위"; break;
		 case 1 : com = "바위"; break;
		 case 2 : com = "보"; break;
		 
		 }
		
		 System.out.printf("컴퓨터는 [%s]를 선택했습니다. \n", com);
		 
		 //String 비교시 equals() 사용
		 if( player.equals(com) ) {
			 System.out.println("비겼습니다.");
			 d++;
		//	 System.out.printf("현재 기록 : %d승 %d무 %d패 \n", v,d,f);
		 
		 } else {
			 
			 // 이기는 경우
			 // 플레이어 - 컴퓨터 
			 // 가위		보
			 //	바위		가위
			 // 보		바위
			 
			 // 사용자가 이기는 경우에 true가 되는 상황을 미리 변수로 선언
			 boolean win1 = player.equals("가위") && com.equals("보");
			 boolean win2 = player.equals("바위") && com.equals("가위");
			 boolean win3 = player.equals("보") && com.equals("바위");
			 
			 if(win1 || win2 || win3)	{
				 System.out.println("플레이어 승리!");
				 v++;
		//		 System.out.printf("현재 기록 : %d승 %d무 %d패 \n", v,d,f);
				 // 지는 경우
			 } else {
				 System.out.println("졌습니다ㅠㅠ");
				 f++;
		//		 System.out.printf("현재 기록 : %d승 %d무 %d패 \n", v,d,f);
			 }
		 }
		 System.out.printf("현재 기록 : %d승 %d무 %d패 \n", v,d,f);
		//
//		if(rsp2 =="가위" && me == "바위") {
//			
//			System.out.printf("컴퓨터는 [%s]를 선택했습니다 \n", rsp2);
//			System.out.println("플레이어 승!");
//			v++;
//			count++;
//			System.out.printf("현재 기록 : %d승 %d무 %d패 \n", v,d,f);
//		}
//		else if(rsp2 =="가위" && me == "보") {
//			System.out.printf("컴퓨터는 [%s]를 선택했습니다 \n", rsp2);
//			System.out.println("졌습니다ㅠㅠ");
//			f++;
//			count++;
//			System.out.printf("현재 기록 : %d승 %d무 %d패 \n", v,d,f);
//		}
//		else	if(rsp2.equals(me)) { // 비길때
//			System.out.println("비겼습니다");
//			d++;
//			count++;
//			System.out.printf("현재 기록 : %d승 %d무 %d패 \n", v,d,f);
//		}
//		if(rsp2 =="바위" && me == "보") {
//			
//			System.out.printf("컴퓨터는 [%s]를 선택했습니다 \n", rsp2);
//			System.out.println("플레이어 승!");
//			v++;
//			count++;
//			System.out.printf("현재 기록 : %d승 %d무 %d패 \n", v,d,f);
//		}
//		else if(rsp2 =="바위" && me == "가위") {
//			System.out.printf("컴퓨터는 [%s]를 선택했습니다 \n", rsp2);
//			System.out.println("졌습니다ㅠㅠ");
//			f++;
//			count++;
//			System.out.printf("현재 기록 : %d승 %d무 %d패 \n", v,d,f);
//		}
//		else	if(rsp2.equals(me)) { // 비길때
//			System.out.println("비겼습니다");
//			d++;
//			count++;
//			System.out.printf("현재 기록 : %d승 %d무 %d패 \n", v,d,f);
//		}
//		if(rsp2 =="보" && me == "가위") {
//			
//			System.out.printf("컴퓨터는 [%s]를 선택했습니다 \n", rsp2);
//			System.out.println("플레이어 승!");
//			v++;
//			count++;
//			System.out.printf("현재 기록 : %d승 %d무 %d패 \n", v,d,f);
//		}
//		else if(rsp2 =="보" && me == "가위") {
//			System.out.printf("컴퓨터는 [%s]를 선택했습니다 \n", rsp2);
//			System.out.println("졌습니다ㅠㅠ");
//			f++;
//			count++;
//			System.out.printf("현재 기록 : %d승 %d무 %d패 \n", v,d,f);
//		}
//		else	if(rsp2.equals(me)) { // 비길때
//			System.out.println("비겼습니다");
//			d++;
//			count++;
//			System.out.printf("현재 기록 : %d승 %d무 %d패 \n", v,d,f);
//		}
//		
		
		
			}// for문 종료 
			
				
				
		
	}
		
	
		
	
	
	
	

		}
	
	
	
