package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	public static void main(String[] args) {
		
		//sc.next() : 한 단어 입력, 띄어쓰기 미포함
		//				-> 띄어쓰기, 엔터가 입력 종료를 의미

		// sc.nextLine() : 한 문장(한 줄) 입력, 띄어쓰기 포함
		//				-> 엔터가 입력 종료를 의미

		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : " );
			String name = sc.nextLine();
		System.out.print("학년(정수) : ");
			int grade = sc.nextInt();
		System.out.print("반(정수) : ");
			int ban = sc.nextInt();
		System.out.print("번호(정수) : ");
			int num = sc.nextInt();
			// 입력버퍼에 엔터가 남음
			
			sc.nextLine();  //입력버퍼 맨앞에 남아있는 개행문자(엔터)를 꺼내옴 -> 입력버퍼를 청소
			
		System.out.print("성별(남학생/여학생) : ");
			String gender = sc.nextLine();
			//버퍼에 맨앞에 남은엔터(\n)를 꺼내옴
			// -> 문자열(남학생)을 입력하지 못하고 넘어감
			
			// ** 해결 방법 **
			// 입력버퍼 맨앞에 엔터(개행문자,\n)를 제거 후에 '남학생'입력 가능
			
			// 맨 앞에 개행문자가 남는 경우 -> next(), nextInt(), nextFloat(), nextDouble() 등..
			//    nextLine()을 제외한 모두 
			//   뒤에 sc.nextLine()을 한번 더 작성하기
			
			
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
			double point = sc.nextDouble();
		
	
			
		System.out.println(grade+"학년 " + ban +"반 " + num +"번 " + name+ " "+gender+
				"의 성적은 " + point + "점 입니다.");
			
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다. \n" , 
				grade, ban,num,name,gender,point);
		

	}

}
