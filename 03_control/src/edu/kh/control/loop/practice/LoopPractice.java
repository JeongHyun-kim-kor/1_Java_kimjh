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
		//https://blog.naver.com/jjarajjara1903/222440166448
		for(int i = 1 ; i <= num ; i++) {  // 한칸아래로
			
			for(int j= num-1 ; j >= num ; j--) { // 공백  // 감소해야하고
				System.out.print(" ");
			
//			for( ) {  // 별찍기   // 증가해야하고
		
			for(int k = 2; k <=j; k++) {
				System.out.print("*");
			}
			System.out.println();
			}	
					
					
					
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
				
			}
		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num= sc.nextInt();
		
		// 나머지가 1과 0에만 입력개수만큼의 별 출력 
		// 그 외에 빈칸 별?
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int num= sc.nextInt();
		int count = 0;
		// num = 15 
		
		//입력한 수까지2와 3의 배수를  출력해라
		for(int i = 1 ; i <=num ; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i+" ");
				count++;

			} 
//			else if ( i % 6 == 0) {
//			}
		}
		System.out.println("\ncount : " + count);
		
		//1~15까지 출력해라 + for 문
//		for(int i = 1; i<=num ; i++) {
////			if(num % i == 0) // 공약수 출력
//			if(i / (i*2) == 0 || i / (i*3) == 0) 
//			System.out.print(i+ " ");
//		}
		
//		
//		if(num / 2 == 0 || num / 3 == 0)
//		{
//			
//		}
//		for(int i = 1 ; i <=num ; i++) {
//			System.out.print(i);
//		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
