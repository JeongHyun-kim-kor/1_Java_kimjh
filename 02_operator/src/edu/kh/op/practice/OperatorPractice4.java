package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	
	
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		System.out.print("영어 : ");
		int english = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		// 합계를 저장하기 위한 변수 ★
		//int sum = 0;
		
		int sum = korean + english + math;
		
		// 평균을 저장하기 위한 변수
		
//		double avg = (double)(korean + english + math)/3.0;
		double avg = sum/3.0;
		//double avg  = sum/3.0; int > double 자동 형변환
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg );
		
		String result = (korean >= 40 && english>=40 && math>=40) && avg>=60 ?
				"합격" : "불합격";
		System.out.println(result);
	}

}
