package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		// 양수 / 음수/ 0 
	//	String result1 = (input1 == 0) ? "0" : (input1 > 0 ? "양수" : "음수");//(조건식 ? t : f); 
											   // 0을 제외한 모든 수가 올 수 있다. 
	//	System.out.println(result1 + "입니다.");
	//	String result1 = result1 + "입니다." ;

		
		//내가 한 것
//		String result = input1 > 0 ? "양수" :
//			(input1 == 0 ? "0" : "음수");
//		System.out.println(result + "입니다.");
		//t 선생님
		// 양수 / 음수 / 0
				//String result = (input == 0) ? "0" : (input > 0 ? "양수" : "음수") ;
				
				String result = (input > 0) ? "양수" : (input < 0 ? "음수" : "0") ;
				
				System.out.println(result + "입니다.");
		
		
	}

}
