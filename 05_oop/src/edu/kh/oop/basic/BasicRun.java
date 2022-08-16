package edu.kh.oop.basic;

class BasicRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//new KJH();
		// heap 영역에 KJH 클래스에 정의된 내용을 이용하여
		// KJH 객체 생성(할당)
		
		KJH 김정현 = new KJH();
		System.out.println("이름 : "+김정현.name);
		System.out.println("나이 : "+김정현.age);
		System.out.println("생년월일 : "+김정현.birthday);
		
		//System.out.println("비밀번호 : "+ 김정현.password);
		
		//비밀번호를 볼 수 있는 간접 접근 방법(기능을 호출)
		김정현.showPassword();
		
		
		// 기능 수행
		김정현.eat();
		김정현.study();
		김정현.plus(50, 100);
		
		
	}

}
