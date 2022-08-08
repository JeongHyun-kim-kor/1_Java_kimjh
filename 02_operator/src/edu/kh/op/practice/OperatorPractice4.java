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
		
		
		int sum = korean + english + math;
		double avg = (double)(korean + english + math)/3.0;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg );
		
		String result = (korean >= 40 && english>=40 && math>=40) && avg>=60 ?
				"합격" : "불합격";
		System.out.println(result);
	}

}
