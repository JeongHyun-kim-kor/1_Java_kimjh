package edu.kh.op.ex;

public class OperatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감 연산자 : ++ , --
		// -> 피연산자를 1 증가 또는 감소시키는 연산자
		
		// 전위 연산 : ++a , --a
		// -> a를 먼저 1 증가/감소 시키고 다른 연산을 수행
		
		// 후위 연산 : a++, a--
		// -> 다른 연산을 먼저 다 수행한 후 마지막에 a를 1 증가/감소
			
		int num1 = 10;
		int num2 = 10;
		
		num1++; //11
		num2--; //9
		System.out.println("num1++ : " + num1);
		System.out.println("num2-- : " + num2);
		
		System.out.println("------------------------");
	
		System.out.println("++num1 + 10 : " + (++num1 + 10)); // 22 
							// num1 : 12 + 10 = 22
		
		System.out.println("num1 : " + num1); // 12
	
		
		// 후위 연산
		System.out.println("num2-- + 10 : "+ (num2-- + 10));
											// 9  + 10 
											// 결과는 19가 나오고 그 후에 num2의 숫자에서 1 감소
		
		System.out.println("num2 : " + num2); // 8
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
