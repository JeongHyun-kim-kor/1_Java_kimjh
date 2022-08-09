package edu.kh.control.condition;

import java.util.Scanner;

// 시키는 코드를 수행하는 부분
// (시키는 일 하는 사람)
public class ConditionExample {

	public void test1() {
		System.out.println("1번 기능을 수행합니다.");
	}
	
	public void test2() {
		System.out.println("2번 기능을 수행합니다.");
	}
	
	
	// if문 예시 1번
	public void ex1() {
		System.out.println("[if문 예시1]");
		
		// if(만약에) : 조건식이 true일때만 내부에 작성된 코드를 수행하는 구문
		
		/* (작성법)
		 *
		 * 
		 * if(조건문) {
		 *   
		 *   // 조건식이 true일 때 수행되는 코드
		 *   
		 *   
		 *   }
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 입력된 정수가 짝수인지 검사
		
		if(input % 2 == 0) {
			System.out.println("짝수 입니다.");
		}
		
		// 입력된 정수가 홀수인지 검사
		if(input % 2 != 0 ) {
			System.out.println("홀수 입니다.");
		}
		
		System.out.println("[if문 예시 1 종료]");
		
	}
	
	public void ex2() {
		System.out.println("[if문 예시 2]");
		
		Scanner sc = new Scanner(System.in);
		
		// if - else 문
		
		// if문 조건식의 결과가 true이면 if문,
		// false이면 else문을 수행하는 구문
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if( input % 2 == 1) { // 홀수인 경우
			System.out.println("홀수 입니다.");
			} else {
			// 중첩 if 문
				if(input  == 0) { // 0인 경우
			System.out.println("0 입니다.");
			   }else {  // 홀수도 0도 아닌경우(짝수인 경우)
			System.out.println("짝수 입니다.");
			}
		
		}
			
		System.out.println("[if문 예시 2 종료]");
	}
	
		public void ex3() {
			
			// if - else if - else 
				//else if는 여러번 반복될 수 있다.
			Scanner sc = new Scanner(System.in);
			
			System.out.print("1~12 사이의 정수를 입력해주세요 : ");
			String season = ""; // 변수 선언
			int month = sc.nextInt();
			
			// 봄 (3 ~ 5월)
			if(month >= 3 && month <=5) {
				season = "봄";
			} else if (month >= 6 && month <= 8) {
				season = "여름";
			} else if (month >= 9 && month <= 11) {
				season = "가을";
			} else if (month == 12 || month == 1 || month == 2) {
				season = "겨울";
			
			} else {
				season = "해당하는 계절이 없습니다.";
			}
			System.out.println(season);
		}
	
	
	public void ex4() {
		// 나이를 입력 받아
		// 13세 이하면 "어린이"
		// 13세 초과 19세 이하면 "청소년"
		// 19세 초과시 "성인"
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();

		String growth;
		
		if (age <= 13) {
			growth = "어린이";
//			System.out.println("어린이");
	//	}else if (age > 13 && age <= 19) {
		} else if (age <= 19) {
			growth = "청소년";
//			System.out.println("청소년");
		}else {
			growth = "성인";
//			System.out.println("성인");
		}
		
			System.out.println(growth);
	}
	
		public void ex5() {
			 // 놀이기구 탑승 제한 검사
		      
		      // 나이가 12세 이상, 키 140.0cm 이상 일 경우에만 "탑승 가능"
		      // 나이가 12미만인 경우 : "적정 연령이 아닙니다."
		      // 키가 140.0cm 미만 : "적정 키가 아닙니다."
		      // 나이를 0세 미만, 100세 초과 시 : "잘못 입력 하셨습니다."
				// 잘못된 경우부터 먼저 조건에 쓴다.(강사님 )
			// 1. 0세 미만 100세 초과
			// 2. 12세 미만인가 아닌가
			// 3. 키 140 초과인가 아닌가
			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.print("나이 입력 : ");
//			int age = sc.nextInt();
//			
//			System.out.print("키 입력 : ");
//			double height = sc.nextDouble();
//			
//			String result = "";
//			
//			if(age < 0 || age > 100 ) {
//				result = "잘못 입력 하셨습니다"; 
//			} else if (age >= 12 && height >= 140.0) {
//				result = "탑승 가능";
//			} else if ( age < 12) {
//				result = "적정 연령이 아닙니다";
//			} else if (height < 140.0) {
//				result = "적정 키가 아닙니다";
//			} 
//				System.out.println(result);
//		}
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.print("나이 입력 : ");
//			int age = sc.nextInt();
//			
//			System.out.print("키 입력 : ");
//			double height = sc.nextDouble();
//			
//			String result;
//
//			if(age < 0 || age > 100) { //0세 미만 100세 초과
//				result = "잘못 입력하셨습니다.";
//			} else {
//				if(age < 12) { //12세 미만
//					result = "적정 연령이 아닙니다.";
//			} else { // 12세 이상
//				if(height < 140.0) { //140 미만
//			  	 result = "적정 키가 아닙니다.";
//            } else {
//			 	 result = "탑승 가능";
//		  }
//     }
//    }
//
//		System.out.println(result);
//	
//	
//	
//	
//	
//		}
/*		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("나이 입력 : ");
//		int age = sc.nextInt();
//		
//		System.out.print("키 입력 : ");
//		double height = sc.nextDouble();
//		
//		String result;
//		
//		if(age < 0 || age > 100) {
//			result = "잘못 입력하셨습니다.";
//		} else if(age<12) {
//			result = "적정 연령이 아닙니다.";
//		} else if(height<140.0) {
//			result = "적정 키가 아닙니다.";
//		} else{
//			result = "탑승 가능";
//		}
		System.out.println(result);
*/		
	
	
	
		}
}
