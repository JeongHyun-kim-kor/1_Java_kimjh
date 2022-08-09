package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		//나
//		if(input > 0 && input % 2 == 0) {
//			System.out.println("짝수입니다");
//		} else if (input % 2 == 1) {
//			System.out.println("홀수입니다.");
//		} else {
//			System.out.println("양수만 입력해주세요.");
//		}
		
		// 선생님 1
/*		if(input > 0) { //양수
			//짝수
			if(input % 2 == 0) {
				System.out.println("짝수 입니다.");
			} else {
			//홀수
			  System.out.println("홀수 입니다.");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
*/		// 선생님 2
		
		
		String result;
		
		if(input <= 0) {
			result = "양수만 입력해주세요. ";
		} else if (input % 2 == 0 ) {
			result = "짝수 입닌다.";
		} else {
			result = "홀수 입니다.";
		}
			System.out.println(result);
	}

	
	public void practice2() {   //2번문제는 ok  나 == 선생님
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		// 합계
		int sum = korean + math + eng;

		// 평균
		double avg = sum/3;
		
		
		if((korean>=40 && math >=40 && eng >= 40) && avg >= 60) { // 합격
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다. 합격입니다");
		} else {
			System.out.println("불합격입니다.");					// 불합격
		}
		
		
	}
	public void practice3() {    //3번문제는 ok  나 == 선생님
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		// 1월 31 / 2월 28 3월 31 4월 30 5월 31 6월 30 7월 31 8월 31 9월 30
		// 10월 31일 11월 30 12월 31일
		int month = sc.nextInt();
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			System.out.println(month+"월은 31일까지 있습니다."); 
			break;
			
		case 4 : case 6 : case 9 : case 11 : 
			System.out.println(month+"월은 30일까지 있습니다."); 
			break;
		
		case 2 : 
			System.out.println(month+"월은 28일까지 있습니다."); 
			break;
		
		
		default : 
			System.out.println(month +"월은 잘못 입력된 달입니다.");
		}
		
		
		
	}
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해주세요 : " );
		double weight = sc.nextDouble();
		
		System.out.print("BMI 지수 : ");
		double BMI = weight/(height * height);
	
		System.out.println(BMI);
		
		String result;
		
		if(BMI <18.5) {
			result = "저체중";			 //코드를 간결하게..
			System.out.println(result);   //코드를 간결하게..
			//System.out.println("저체중");
		}else if(BMI < 23) {
			System.out.println("정상체중");
		}else if(BMI < 25) {
			System.out.println("과체중");
		}else if(BMI < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도 비만");
		}
		
		

		
	}
	//나 
//	public void practice5() {
//		Scanner sc = new Scanner(System.in);
//	
//		System.out.print("중간 고사 점수 : ");
//			int mid = sc.nextInt();   // double mid 로해도 int로 입력받아도 대입연산시 double 자동형변환
//		System.out.print("기말 고사 점수 : ");
//			int fin = sc.nextInt();
//		System.out.print("과제 점수 : ");
//			int work = sc.nextInt();
//		System.out.print("출석 횟수 : ");
//			double check = sc.nextInt();
//			
//			double sum = (mid + check*5)*0.2 + (fin + work)*0.3;
//		
//		if (check < 15) {
//			System.out.println("============ 결과 ===========");
//			System.out.println("Fail [출석 횟수 부족 ("+((int)check)+"/20)]");
//		} else if(sum < 70 ) {
//			System.out.println("============ 결과 ===========");
//			System.out.println("중간 고사 점수(20) : " + mid * 0.2);
//			System.out.println("기말 고사 점수(30) : " + fin * 0.3);
//			System.out.println("과제 점수(30) : " + work * 0.3);
//			System.out.println("출석 점수(20) : " + check );
//			System.out.println("총점 : " + sum);
//			System.out.println("Fail [점수 미달]");
//		} else {
//			System.out.println("============ 결과 ===========");
//			System.out.println("중간 고사 점수(20) : " + mid * 0.2);
//			System.out.println("기말 고사 점수(30) : " + fin * 0.3);
//			System.out.println("과제 점수(30) : " + work * 0.3);
//			System.out.println("출석 점수(20) : " + check );
//			System.out.println("총점 : " + sum);
//			System.out.println("PASS");
//		}
//		
//		
//	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("중간 고사 점수 : ");
			double mid = sc.nextInt();   // double mid 로해도 int로 입력받아도 대입연산시 double 자동형변환
		System.out.print("기말 고사 점수 : ");
			double fin = sc.nextInt();
		System.out.print("과제 점수 : ");
			double work = sc.nextInt();
		System.out.print("출석 횟수 : ");
			double check = sc.nextInt();

			//각각의 점수를 비율에 맞ㅈ게 변경
			mid *= 0.2; // mid = mid * 0.2;
			fin *= 0.3; // 
			work *= 0.3;
//			check *= 5 * 0.2; // 그냥 check = 1점
			System.out.println("============ 결과 ===========");
			double sum = mid + check + fin + work;

		if (check <= 14) {
			System.out.println("Fail [출석 횟수 부족 ("+(int)check+"/20)]");
			
		} else { // 출석 만족하는 상황 > 밑 print문을 출력후
			System.out.printf("중간 고사 점수(20) : %.1f \n", mid);
			System.out.printf("기말 고사 점수(30) : %.1f \n", fin);
			System.out.printf("과제 점수(30) : %.1f \n", work);
			System.out.printf("출석 점수(20) : %.1f \n", check);
			
			System.out.printf("총점 : %.1f \n", sum	);
		
			// Fail [점수 미달] / PASS를 출력할지?
		if(sum>= 70.0) {
			System.out.println("PASS");
		}else {
			System.out.println("Fail [점수 미달]");
		}
		
		}
		
	}
}
