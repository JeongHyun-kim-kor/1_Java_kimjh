package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		
//		길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
//		[실행 화면]
//		1 2 3 4 5 6 7 8 9
//		짝수 번째 인덱스 합 : 25
		
		int [] arr = new int [9];
		int sum = 0;
	//	System.out.println(arr.length); // 길이 9
		
		for(int i =0; i< arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
			
			if(i%2  == 0) { // 0 2 4 6 8
								//  1 3 5 7 9
				
			  sum += arr[i];
			}
		}
		System.out.print("\n짝수 번째 인덱스 합 : "+sum);

	}
	
	
	public void practice2() {
		
		int[] arr = new int [9];
		
		int sum = 0;
		
		for(int i = 9; i >0 ;i--) {
			arr[i-1] = i;
			System.out.print(arr[i-1]+" ");
			
			if((i-1)%2 == 1) {
				sum += arr[i-1];
			}
			
		}
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
		// 9 8 7 6 5 4 3 2 1                      8 6 4 2
		// 0 1 2 3 4 5 6 7 8 
	}
	
	
	public void practice3() {
		
	 Scanner sc = new Scanner(System.in);
	 System.out.print("양의 정수 : ");
	 int input = sc.nextInt();
	 
	 int [] arr =new int [input];
	 
	 for(int i=0; i<input;i++) {
		 arr[i] = i+1;
		 System.out.print(arr[i]+" ");
	 }
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in)	;
		
		int[] arr = new int[5]	;
//		int input = sc.nextInt()	;
		for(int i = 0; i<5; i++) {
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt()	;
			arr[i] = input;
			//System.out.println(arr[i]);
			
		}

		
		
		System.out.print("검색할 값 : ");
		int find = sc.nextInt();
//		
		for(int i=0;i<5;i++) {
			
			if(find ==arr[i] ) {
				System.out.print("인덱스 : "+ i);
			}
		}
//			
//			
//		}
		
		
	}
	
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String munja = sc.next();
		int count=0;
		char[] arr = new char[munja.length()];
		
		for(int i =0; i< munja.length() ; i++) {
			char ch = munja.charAt(i);
			arr[i] = ch;
			}
		
		System.out.print("문자 : ");
		char alpha = sc.next().charAt(0);
		
	for(int i = 0; i< munja.length(); i++) {
		if(arr[i]==alpha) {
			System.out.print("\n"+ munja+"에 "+ alpha+"가 존재하는 위치(인덱스) : "+ i);
			count++;
		}
	}
		System.out.println();
		System.out.print(alpha+" 개수 : "+ count);
		
		
		
//		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : %d %d",munja,alpha,);
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int []	arr = new int[input];
		int sum = 0;
		for(int i=0; i<input ; i++	) {
			System.out.print("배열 "+ i +"번째 인덱스에 넣을 값 : " );
			int input2 = sc.nextInt();
			arr[i] = input2;
		}
		for(int i =0; i <input ; i++) {
			System.out.print(arr[i]+" ");
			sum += arr[i];
			
		}
		System.out.print("\n총 합 : " + sum);
		
	}
	
	public void practice7() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String jumin = sc.next();

		char[] arr = new char[14];
		
		for(int i = 0 ; i<jumin.length(); i++) {
			
			arr[i] = jumin.charAt(i);
//			System.out.print();
		}
		for(int i=0;i<jumin.length();i++) {
			if(i>7) {

				arr[i]= '*';
			}
			System.out.print(arr[i]);
		}
			
			
//			
//			char num = jumin.charAt(i);
//			char[] arr =new char[num];
//			jumin += arr[i];
//			System.out.println(arr[i]);
//		}
		
		
	}
	
	public void practice8() {
		
	}
	public void practice9() {
		
		System.out.print("발생한 난수 : ");
		int [] arr = new int[10];
		for(int i=0; i<arr.length;i++) {
			int nan = (int)(Math.random()*10+1);
			arr[i] = nan;
			 System.out.print(arr[i]+" ");
		}
		
	}
	
	public void practice10() {
		System.out.print("발생한 난수 : ");
		int [] arr = new int[10];
		for(int i=0; i<arr.length;i++) {
			int nan = (int)(Math.random()*10+1);
			arr[i] = nan;
			 System.out.print(arr[i]+" ");
			 
		}
			 int max = arr[0];
			 int min = arr[0];
			 
			 for(int i =0; i<arr.length; i++) {
				 	
				 if(max < arr[i]) {
					 max = arr[i];
				 }
				 if(min > arr[i]) {
					 min = arr[i];
				 }
			 
			 
			
		}
			 System.out.println();
			 System.out.print("최대값 : " + max);
			 System.out.print("\n최소값 : " + min);
	}
	
	
	public void practice11() {
		System.out.print("발생한 난수 : ");
		int [] arr = new int[10];
		
		
		for(int i=0; i<arr.length;i++) {
			int nan = (int)(Math.random()*10+1);
			arr[i] = nan;
//			 System.out.print(arr[i]+" "); // 출력
			 
		
				
			}
		int num = arr[0];
		boolean flag = false; // 중복 o
		
		
		for(int j=0; j<arr.length; j++) {
			
			if(num == arr[j]) {
				flag = true; //true면 중복x
				continue;
			}else {
				
				System.out.print(arr[j]+" ");
				
			}
			
//			if(flag = true) {
//				
//			}	
		}
	
	
}
	
	public void practice15() {
		
		int[][] arr = new int[3][3];
		
		for(int row=0; row<arr.length; row++) { //행 3
			
			for(int col = 0; col < arr[row].length; col++ ) {
				
				System.out.printf("(%d, %d)", row,col);
			
			}
			System.out.println();
			
		}
		
		
	}
	
	public void practice16() {
		
		int [][] arr = new int[4][4];
		
		int count =1;
		
		
		
		
		for(int row=0; row <arr.length; row++) {
			
			for(int col=0; col <arr[row].length; col++) {
				arr[row][col] = count;
//				System.out.print(arr[row][col]+" ");
				System.out.printf("%3d",count);
				count++;
//				System.out.printf("(%d, %d)", row,col);
//				System.out.printf("%d", )
					
				}
			System.out.println();
			}
		
		
	}
	
	
	public void practice17() {
		
		int[][] arr = new int [4][4];
		int count = 16;
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = count;
				System.out.printf("%3d", count);
				count--;
				
			}
			System.out.println();
		}
	}
	
	public void practice18() {
		
		int [][] arr = new int [4][4];
		
		
		for(int row=0; row<arr.length-1; row++) {
			
			for(int col=0; col <arr[row].length-1; col++) {
				int ran = (int)(Math.random()*10+1);
				arr[row][col] = ran;
				
				// 각 행의 마지막 열 
				arr[row][arr[row].length-1] += ran; //각행 마지막열전까지 난수 누적
				arr[arr.length-1][col] += ran;
				arr[arr.length-1][arr[row].length-1] += ran;
				
			}
			}
				
//				System.out.print(arr[row][col]+ "   ");  //3행 3열까지만 난수대입
			
			//난수 생성, 3행 3열까지 생긴 난수를 더해서 마지막 열, 행값에 대입
				for(int i=0; i<arr.length; i++) {
					
					for(int j = 0; j<arr[i].length; j++) {
						System.out.printf("%3d",arr[i][j]);
					}
					System.out.println();
				}
				
			
	
		
	}
	
	
	
	
	
	
	
}
