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
	public void practice3R()	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0 ;
		
		for(int i = 1 ; i<=num; i++) {
			
			if(i == num) {
				System.out.print(i + " = ");
			} else {
				System.out.print(i+" + ");

			}
			
			sum += i;
		}
		System.out.println(sum);
		
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {  // num1, num2 중에 0이 있는가?
			System.out.println("1 이상의 숫자를 입력해주세요.");
		
		} else { // 둘 다 1미만이 아니다
			
			if(num1 > num2) {  //변수 1개로 푸는방법 ( 방법2 는 변수 2개)
				//두 변수의 값을 서로 바꾸는 방법
				int temp = num1; // temp : 8 / num 1 : 8 / num2 : 4 >> 
				
				num1 = num2 ; // temp : 8 / num 1 : 4 / num2 : 4

				num2 = temp ; // temp : 8 / num 1 : 4 / num2 : 8
							
			}
			
			for(int i = num1; i<= num2; i++) {
				System.out.print(i + " ");
			}
		}
	}
		public void  practice4R() {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫 번째 숫자 :");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 :");
			int num2 = sc.nextInt();
			
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} 
			if (num1 < num2)  { // num1 num2 둘다 1미만이 아니다
				for(int i = num1; i <= num2 ; i ++) {
					System.out.print(i+ " ");
			} 
					
			 } else {
				 for(int i = num2; i <= num1 ; i ++) {
						System.out.print(i+ " ");
			}
			 }
		}
			
			
			
			
			// 방법2
//			int start = num1;
//			int end = num2;
//			
//			if(num1 > num2) { //먼저 입력한 숫자가 크면 start / end를 바꿈
//				start = num2;
//				end = num1;
//			} 
//			
//			for (int i = start ; i <= end ; i++) {
//				System.out.print(i +" ");
//			
//			}
			
			
			
			// 방법1
//		  if(num1 < num2) {	
//			for(int i = num1 ; i<= num2 ; i++) {
//				System.out.print(i + " ");
//			}
//		  } else {
//			for(int i = num2 ; i<= num1 ; i++) {
//				System.out.print(i + " ");
//			}
//		  }
		
//		}
			// 나
//		else if(num1 < num2 || num1 > num2) {
//			for(int i = num1 ; num1<=num2 ; num1++) {
//				System.out.print(i++ +" ");
//			}
//		
//		}
			
		

		
	
//			}
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
		
		if(num<2) {   // !(num>=2 && num <=9)   >> ! 활용 ★★★★
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
		for(int dan = num ; dan<=9; dan++) {
			System.out.println("=====" + dan + "단 =====");
			for(int i = 1 ; i<=9 ; i++) {
				System.out.printf("%d X %d = %d\n", dan,i,dan*i);
			}
			System.out.println(); // 단 사이 줄 바꿈
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
	/*	for(int i = 1 ; i <= num ; i++) {  // 한칸아래로
			
			for(int j= num ; j >= i ; j--) { // 공백  // 감소해야하고
				System.out.print(" ");
			}
			for(int k = 0; k <=i-1; k++) {
				System.out.print("*");
			
			}
			System.out.println();
			}	
		*/
		//[선생님]

		// 1) 일단 1~4까지 늘어나는 삼각 별 만들기  > 2) for문 / if문 이용
		//2) - for문을 이용한 풀이
//		for(int row = 1 ; row <= num ; row++	) {
			
			//for(int i = num-1 ; i >= 1 ; i--) {    // 기본 > 밑에 2개가 변경안 
//			for(int i = num - row ; i <= 1 ; i--) {	 방법1) 초기식 변경 
//			for(int i = num -1 ; i >=row ; i--) {	 //방법2) 조건식변경 
//				// num == 4
//				System.out.print(" ");
//				
//			}
			
//			for(int col = 1 ; col <= row; col++) { // for문
		for(int row = 1 ; row <= num ; row++	) {// if문을 이용한 풀이
			for(int col = 1; col <= num ; col++) { // if문을 이용한 풀이
				// num = 4
				if(col <= num - row) {
 				//1,2,3   [   3    ]
					System.out.print(" "); // 공백 3칸 출력
				} else {
					System.out.print("*"); // if문
					
				}
				
				//System.out.print("*");  // for문
			}
			System.out.println();
		}
		
					
			
		
		
		
		
		
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num= sc.nextInt();
		//1) 삼각형 위 / 아래 쪼개기
		
			//위쪽 삼각형
			for(int row = 1 ; row <= num; row++) {
				
				for(int col = 1; col <=row ; col++) {
				
					System.out.print("*");
			}
				System.out.println();
			}
			
			//아래쪽 삼각형
			for(int row = num-1 ; row >= 1; row--) {  //방향만 돌림(위쪽 삼각형에서)
				
				for(int col = 1; col <=row ; col++) {
				
					System.out.print("*");
			}
				System.out.println();
			}
	}
			
			/* 또다른 풀이
			 * 
			 * for(int row=1; row<=num*2=1;row++{
			 * 
			 * if(row < num) {
			 * 	for(int col=1; col<=row; col++) {
			 * 	System.out.print("*";
			 * }
			 * }else {
			 * 	for(int col=num; col > row-num; col--){
			 * 	System.out.print("*");
			 *}
			 * }
			 * System.out.println();
			 * }
			 */
		
		
		
		
//			for(int i = 1 ; i <=num+2 ; i++) {
//				for(int j = 1 ; j <= i ; j++) {
//				System.out.print("*");
//				}
//				for(int k = num-1 ; k < num-1  ; k--){
//					System.out.print("*");
//					
//				}
//				
//			System.out.println();
//			}
		
		
		
		
//	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input= sc.nextInt();
		
		// for 문
//		for(int row = 1; row <= input ; row++) {
//			
//			for(int i = input-1 ; i>=row ; i--) {
//				System.out.print(" ");
//			}
//			for(int col =1 ; col <= row * 2 -1 ; col++) {
//				System.out.print("*");
//			}
		//if문
		for(int row = 1; row <= input ; row++) {

		for(int col = 1;  col<= input *2 - 1 ; col++) {
			if(input-row>=col || input +row <=col) {
				System.out.print(" ");
		}else {
			System.out.print("*");
		}
		}
		System.out.println();
		
		
			
	}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input= sc.nextInt();
		//언제 공백을 출력할까보다 언제 별을 출력할까가 이해하기에 더 쉽다.
		
		for(int row = 1 ; row <= input ; row++) {
			
			for(int col = 1; col<= input ; col++) {
				
				// 첫 번째 / 마지막 줄, 칸일 때만 * 출력
				if(row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
					
				} else {
					System.out.print(" ");
				}
							
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int input= sc.nextInt();
		int count = 0;
		// num = 15 
		
		//입력한 수까지2와 3의 배수를  출력해라
		for(int i = 1 ; i <=input ; i++) {
			
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i+" ");
			
				// 2와 3의 공배수
				if(i % 2 == 0 && i % 3 == 0) {
				count++;
				}
			} 
//			else if ( i % 6 == 0) {
//			}
		}
		System.out.println("\ncount : " + count);
		
		//1~15까지 출력해라 + for 문
//		for(int i = 1; i<=num ; i++) {
//			if(num % i == 0) // 공약수 출력
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
