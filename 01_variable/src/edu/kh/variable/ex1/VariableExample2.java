package edu.kh.variable.ex1;

public class VariableExample2 {

	public static void main(String [] args) {
	  
		// 변수 선언 : 메모리에 값을 저장할 공간을 할당
		
		boolean booleanData; 
		// 논리값(true/false)을 저장할 공간 1byte를 
		// 메모리에 할당하고, 그 공간을 booleanData라고 부르겠다.
		
		int iNum;
		// 정수 값을 저장할 공간 4byte를 메모리에 할당하고
		// 그 공간을 iNum이라고 부르겠다.
		
		long longNum;
		// 정수 값을 저장할 공간 8byte를 메모리에 할당하고
		// 그 공간을 longNum이라고 부르겠다.
		
		byte bNum;
		// 정수 값을 저장할 공간 1byte를 메모리에 할당하고 bNum이라고 부르겠다.
		bNum = 127;
		
		short sNum;
		sNum = 1000;
		// -> byte/short 는 거의 사용되지 않는 자료형으로
		// 별도의 리터럴 표기법이 없음 -> int 표기법을 같이 사용
		
		
		float fNum; // 실수형 변수 4byte 할당
		
		double dNum; // 실수형 변수 8byte 할당
		
		
		char ch1; // 문자형 변수 2byte 할당
		char ch2; // 문자형 변수 2byte 할당
		
		
		
		
		
		
		// 값 대입 : 선언된 변수에 값(리터럴)을 대입하는 것
		
		booleanData = false;
		// boolean 자료형 변수는 true / false 만 저장할 수 있다. 
		// -> boolean 의 리터럴 표기법은 true / false 
		
		iNum = 1000000; // 100만 
		// -> int의 리터럴 표기법은 기본적인 정수 표기법 
		
		// iNum = 10000000000;
		// The literal 10000000000 of type int is out of range
		
		longNum = 10000000000L; 
		// 10000000000은 int 표기법이므로 int의 최대 크기를 넘어설 수 없다.
		// -> long 자료형의 리터럴 표기법은 정수 뒤에 L 또는 l 작성.
		
		fNum = 3.14F;
		// float의 리터럴 표기법은 실수 뒤에 F 또는 f 작성.
		
		dNum = 1.23;
		// double의 리터럴 표기법은 기본 실수 표기법
		
		ch1 = 'A';
		// char의 리터럴 표기법은 ''(홑따옴표) 
		ch2 = 66; // 'B'
		// char 자료형은 숫자-문자 형태의 문자표에서
		// 일치하는 문자나 숫자의 문자부분만 출력
		// 문자는 문자그대로 출력되고, 숫자는 그 숫자에 해당하는 문자 출력
		
		// syso + ctrl + spacebar -> println() 자동 완성
		System.out.println(booleanData);
		System.out.println(iNum);		
		System.out.println(longNum); // l생략
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(fNum);   // f생략
		System.out.println(dNum);
		System.out.println(ch1);
		System.out.println(ch2);  // 66 -> B 출력
		
		// 출력시 L, F같은 리터럴 표기법은 생략된다.
		// 배운것들은 누적되야 한다.
		
		
		
		// 자료형을 규정함으로서 문자형, 정수형, 실수형 등 으로 정해지기 때문에
		// 오히려 편해질수도 있다. 
		
		// byte short int long / double float / boolean / char 
		//       정수                실수       논리       문자
		//                 ##L           ##F   True/False / 숫자로 입력해도 문자로 출력
	}
}