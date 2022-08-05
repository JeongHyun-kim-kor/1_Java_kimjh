package edu.kh.variable.ex1;

public class VariableExample5 {

	public static void main(String[] args) {

		// ctrl + alt + 방향키 위 or 아래 \ 해당 줄 복사
		
		/* 출력 메서드
		 * 
		 * System.out.print("내용")
		 * ()안의 내용을 출력 (줄바꿈 x)
		 * 
		 * System.out.println("내용")
		 * ()안의 내용을 출력 (줄바꿈 O)
		 * 
		 * System.out.printf("내용 + 패턴", 패턴에 들어갈 값)
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		System.out.print("aaaaa");
		System.out.print("bbbbb");
		System.out.println("ccccc");
		System.out.println("ddddd");
		
		
		String name = "백동현";
		int age = 33;
		char gender = '남';
		double height = 175.1;
		boolean tf = true;
		
		// 백동현님은 33세 남성, 키는 175.1cm 입니다. (true)
		System.out.println(name+"님은 " + age +"세 " + gender+"성, " +
		"키는 "+ height+"cm 입니다. (" + tf + ")");
		
	//	System.out.printf("백동현님은 33세 남성, 키는 175.1입니다. (true)", );
		System.out.printf("%s님은 %d세 %c성, 키는 %.1fcm 입니다. (%b)\n", name, age, gender, height, tf );
												// 소수점 아래로 1칸만 출력하겠다.
		System.out.println("줄 바꼈나요?");  // 단점 : 줄 안바뀜 
		//  \n으로 해결 (개행)하는 탈출문자
		
		System.out.println("내가 추가한 내용 16 13");
		
		System.out.println("1619");
		
		
		
		
		
		
	}

}
