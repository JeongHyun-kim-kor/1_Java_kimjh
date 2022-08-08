package edu.kh.op.ex;

public class OperatorExample4 {

	public static void main(String[] args) {
	
		// 논리 연산자 : &&(AND), ||(OR)
		
		// &&(AND) 연산자 : 둘 다 true이면 true , 나머지는 false
		// ~와, 그리고(~이고), ~이면서(~면서) , ~부터 ~까지 , ~사이
		
		int a = 101;
		
		// a는 100이상이면서 짝수인가?
		
		boolean result1 = a >=100; //a는 100이상 ?  true
		boolean result2 = a % 2 == 0; // false
		
		System.out.println("a는 100이상이면서 짝수인가? " + (result1 && result2)); // false
		// ( )를 하지 않으면 +가 우선순위여서 에러가 난다.
		
		int b = 5;
		// b는 1부터 10 사이의 정수인가?
		
		//boolean result3 = 1 <= b <= 10 ;  // 연산이 1개씩 밖에  안된다.
		// 1) 1 <= b   > true    2) true <= 10 이 되서 에러
		boolean result3 = 1 <= b;  // b는 1 이상인가?
		boolean result4 = b <= 10;  // b는 10 이하인가?
		
		System.out.println("b는 1부터 10사이의 정수인가? " + (result3 && result4));
		
		
		
		// ||(OR) 연산자 : 둘 다 false이면 false, 나머진 true
		// 또는, ~거나, ~이거나
		
		int c = 10;
		
		// c는 홀수 이거나 10을 초과한 수인가?
		
		System.out.print("c는 홀수 이거나 10을 초과한 수인가? : ");
		System.out.println( (c % 2 == 1) || (c > 10));
							// false          false     >> false
		
		int d = 20;
		
		// d는 1부터 100 사이의 숫자 또는 음수인가?
		System.out.print("d는 1부터 100 사이의 숫자 또는 음수인가?");
		
		boolean result5 = ((d >= 1 && d <= 100) || (d < 0));
						// true          true        false
						//        true           false
						//               true;
		System.out.println(result5);  // AND  OR 
		
		System.out.println("------------------------");
		
		// 논리 부정 연산자 : ! (NOT)
		// 논리값을 반대로 바꾸는 연산자
		
		System.out.println("!result5 : " + !result5); // true --> false(반대로 변경)
		
		
		int e = 3;
		
		boolean result6 = e >= 1 && e < 5; // e는 1 이상이고 5 미만이다.
		
		// e는 1미만이거나(또는) 5 이상이다. //
		boolean result7 = e < 1 || e >=5;
		
		
		// result6와 7은 서로 반대
		// result6 = true result7 = false
		System.out.println(result6 == result7); // false
		System.out.println(!result6 == result7); // true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
