package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : " );
		String name = sc.next();
		System.out.print("학년(정수) : ");
		int grade = sc.nextInt();
		System.out.print("반(정수) : ");
		int ban = sc.nextInt();
		System.out.print("번호(정수) : ");
		int num = sc.nextInt();
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double point = sc.nextDouble();
		
		
		System.out.println(grade+"학년 " + ban +"반 " + num +"번 " + name+ " "+gender+
				"의 성적은 " + point + "점 입니다.");
		
		
//		System.out.print("이름 : " + name);
//		System.out.print("학년(정수) : " + grade);
//		System.out.print("반(정수) : " + ban);
//		System.out.print("번호(정수) : " + num);
//		System.out.print("성별(남학생/여학생) : " + gender);
//		System.out.print("성적(소수점 아래 둘째 자리까지) : " + point);
		
		
		
	//	System.out.printf("%d학년 %d반 %d번 ");
		

	}

}
