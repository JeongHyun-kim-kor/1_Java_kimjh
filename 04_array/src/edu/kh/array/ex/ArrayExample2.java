package edu.kh.array.ex;

import java.util.Scanner;

public class ArrayExample2 {
	
	// 변수 : 값을 저장하기 위해 메모리상의 공간을 할당
	// (1개의 자료형, 1개의 데이터)
	
	// 1차원 배열 : 자료형이 같은 변수를 묶음으로 다루는 것
	// (1개의 자료형, n개의 데이터)
	
	// 2차원 배열 : 자료형이 같은 1차원 배열을 묶음으로 다루는것
	// 			2차원 배열 == 1차원 배열 참조 변수의 묶음
	// (1개의 자료형, n개의 데이터)
	
	
	public void ex1() {
		
		//2차원 배열 선언 및 할당
		int[][] arr = new int[2][3];
		
		// 인덱스를 이용한 초기화
		
		arr[0][0] = 7;
		arr[0][1] = 15;
		arr[0][2] = 20;
		
		arr[1][0] = 30;
		arr[1][1] = 41;
		arr[1][2] = 45;
		
		
		// for문을 이용한 순차 접근
		
		// 0행일때 0 1 2
		// 1행일때 0 1 2 
		
		// * 2차원 배열 행의 길이
		System.out.println("행 : "+ arr.length);
		
		
		
		// * 2차원 배열 열의 길기
		System.out.println("열 : "+ arr[0].length);
		// arr[0] 인덱스가 참조하고 있는 1차원 배열의 길이
		
		for(int row=0; row <arr.length; row++ ) {
			
			for(int col=0; col < arr[row].length; col++ ) {
				
				System.out.printf("%d행 %d열 == %d\n", row, col, arr[row][col]);
				
			}
		}
		
	}
	
	public void ex2() {
		
		// 2차원 배열 선언과 동시에 초기화 하는 법
		
		
		char[] arr1 = {'a', 'b', 'c'	};  
		char[] arr2 = {'d', 'e', 'f'};  
		char[] arr3 = {'g', 'h', 'i'};
		
		char[][] arr = { {'a', 'b', 'c'},
						 {'d', 'e', 'f'},
						 {'g', 'h', 'i'}
					   };
		
		// 1. char 입력 받기
		System.out.print("검색할 알파벳을 입력해주세요 : ");
		
		Scanner sc = new Scanner(System.in);
//		char input = sc.nextChar(); 
		// nextChar()는 존재하지 않음-> Scanner 는 char 자료형 입력을 지원하지 않는다.
		
		char input = sc.next().charAt(0);
		// sc.next() : 단어 입력(문자열, String)
		// 문자열.charAt(0) : 문자열 중 0번째 인덱스의 문자 하나를 얻어옴
		
		boolean flag = true; // true면 검색결과 없음 / false면 검색결과 존재
		
		// 2. 2차원 배열 내 검색하기
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				
				// arr[row][col]의 값과 입력값이 같다면
				if( arr[row][col] == input) {
					
					System.out.printf("%c는 %d행 %d열에 존재합니다. \n", input,row,col);
					flag = false;
				}
			}
		}
		
		
		if(flag) {
			System.out.println("일치하는 알파벳이 없습니다.");
		}
				
	}
	
	public void ex2R() {
		// 2차원 배열 선언과 동시에 초기화 하는 법
		
		
				char[] arr1 = {'a', 'b', 'c'	};  
				char[] arr2 = {'d', 'e', 'f'};  
				char[] arr3 = {'g', 'h', 'i'};
				
				char[][] arr = { {'a', 'b', 'c'},
								 {'d', 'e', 'f'},
								 {'g', 'h', 'i'}
							   };
				Scanner sc = new Scanner(System.in);
				System.out.print("검색할 알파벳을 입력해주세요 : ");
				char input = sc.next().charAt(0);
				
				boolean flag = true;    // 밑에 if문 해석 : 만약에 true이면 존재확인 false면 : 존재하지않습니다 출력
				// else를 쓸 수 없는 이유는 d를 입력했을 경우 해당하는 알파벳이 있는 행과 열 외에 나머지 행과 열에 존재하지않습니다가 출력됨
				// 그래서 flag를 써야함
				
				for(int row = 0; row < arr.length ; row++	 ) { // arr.length = 행의 개수
					
					for(int col = 0; col <arr[row].length; col++) { // arr[row].length 1) ex > arr[0].length = 0행의 열의 개수
						
						if(input == arr[row][col]) {
							System.out.printf("%c는 %d행 %d열에 존재합니다.",input,row,col);
							flag = false;
						}
					}
					
					
				}
				if(flag) {
					System.out.println(" 존재하지 않습ㄴ디ㅏ.");
				}
				
	}
	
	public void ex2RR() { // 강사님
		
	}
	
	
	public void ex3() {
		
		// 3행 3열짜리 int 2차원 배열에 난수를 대입
		// 단 마지막행/열은 각 행/열의 합
		// 마지막행, 마지막 열은 전체 난수 합
		
		// 8  5  13
		// 3  7  10
 		// 11 12 23
		
		int[][] arr = new int[3][3];
		
		for(int row=0; row<arr.length -1 ; row++) {    // 1행 1열 1행 2열, 2행 1열 2행 2열까지의 값만 출력  
			/*   ?  ?  x
			 *   ?  ?  x
 			 *   x  x  x   x: 지정된 수가 없다.
			 */
			
			for(int col=0; col<arr[row].length -1 ; col++) {
				
				//난수 생성 및 대입
				int ran = (int)(Math.random() *10); //0~9사이 난수
				arr[row][col] = ran;
				
				// 각 행의 마지막 열
				arr[row][arr[row].length-1] += ran; // 생성된 난수 누적   // row 0, arr[0]의 length = 2 > 1행 1열 / 1행 2열
						//row = 0~2까지, 열은 2까지							 // row 1, arr[1] 의 length = 2 > 2행 1열 / 2행 2열
				// 각 열의 마지막 행
				arr[arr.length-1][col] += ran; // 생성된 난수 누적		//  
				
				// 마지막행, 마지막 열
				arr[arr.length-1][arr[row].length-1] += ran;

			}
		}
		
		// 출력용
		for(int row=0; row<arr.length; row++) {
			
			for(int col=0; col<arr[row].length; col++) {
				System.out.printf("%3d", arr[row][col]);
	}
			System.out.println();//줄바꿈
		}
	
	
	}
	
	public void ex3R() {
		
		// 3행 3열짜리 int 2차원 배열에 난수를 대입
				// 단 마지막행/열은 각 행/열의 합
				// 마지막행, 마지막 열은 전체 난수 합
				
				// 8  5  13
				// 3  7  10
		 		// 11 12 23
		
		int[][] arr = new int [3][3];
		
		
		for(int row=0; row<arr.length; row++) {  // 행의 개수만큼
			
			for(int col = 0; col<arr[row].length; col++) {
				int input = (int)(Math.random()*10);
				 arr[row][col] = input;
				 System.out.print(" "+ input);
				 
				 
				 
				
			}
			System.out.println();
		}
		
		
	}
	
	public void ex4() {
		
		//가변 배열
		// - 2차원 배열 할당시
		// 마지막 배열 차수(열)의 크기를 지정하지 않고 할당
		
		// - 할당 이후 각 행에 각각의 1차원 배열을 참조하게 만듦.
		
		int[][]	arr =new int[5][];
		
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[5];
		arr[3] = new int[2];
		arr[4] = new int[1];
		
		for(int row = 0; row < arr.length; row ++) {
			
			for(int col = 0; col< arr[row].length; col++) {
				System.out.print(arr[row][col] + " " );
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
