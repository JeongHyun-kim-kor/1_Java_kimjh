package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			for(int i = 1 ; i<= num ; i++) {
				System.out.print(i+" ");
			}
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			for(int i = num ; i>= 1 ; i--) {
				System.out.print(i+" ");
			}
		}
		
		
		
		
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		
		for(int i = 1 ; i <= num ; i++ ) {
//			System.out.print(i + " + "  );
//			sum += i;
			if(i==num) {
				System.out.print(i);
			} else {
				System.out.print(i + " + "  );
			}
			sum += i;
		}
		System.out.println(" = " +sum);
		
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		
		} else if(num1 < num2 || num1 > num2) {
			for(int i = num1 ; num1<=num2 ; num1++) {
				System.out.print(i++ +" ");
			}
		
		}
//		else {
//			for(int i = num2 ; num2<=num1 ; num2--) {
//				System.out.print(i++ +" ");
//		}
			
//		}
		
	
			}
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("=====" + num + "단 =====");
		for(int i = 1 ; i<= 9; i++) {
			System.out.printf("%d * %d = %d\n",num,i,num*i );
		}
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num<2) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
		for(int j = num ; num<=9; num++) {
			System.out.println("=====" + num + "단 =====");
			for(int i = 1 ; i<=9 ; i++) {
				System.out.printf("%d * %d = %d\n", num,i,num*i);
			}
		}
				
	}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num= sc.nextInt();
	
		for(int x = 1; x <= num ; x++) {
			for(int i = 1 ; i <= x ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num= sc.nextInt();
		
		
		for(int x = 1 ; x <= num ; x++) {	
				for(int i = num; i >= x  ; i--) {
					System.out.print("*");
				}
			System.out.println();
		}
	
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num= sc.nextInt();
		
		/* 입력 : 4 
		 * 공백 3 2 1 0
		 * *  1 2 3 4
		 */
		for(int x = 1 ; x < num ; x++) {
			System.out.print(" ");

			for (int y = 4 ; y >= x ; y++) {
				System.out.print("*");
			}
			
			System.out.println();

		}
		
		
		
		
		
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num= sc.nextInt();
		
		for (int x = 1 ; x <= num ; x++) {
			
			for(int i = 1 ; i <=num ; i++) {
				System.out.print("*");
				System.out.println();
			}
			System.out.print(" ");
		}
		
		
		
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num= sc.nextInt();
		
		if(num % 2 == 1) {
			for(int i = 1; i<num ; i++) {
				System.out.print("*");
				
			}else {
				System.out.println();
			}
		}
	}
	
	public void practice12() {
		
	}
	public void practice13() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
