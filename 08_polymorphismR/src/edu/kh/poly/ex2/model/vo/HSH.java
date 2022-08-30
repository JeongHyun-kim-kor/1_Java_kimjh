package edu.kh.poly.ex2.model.vo;


// 클래스 상속 : extends
// -> 부모가 완성한 기능을 자식이 물려받아서 사용
// 자식 기능 + 부모 기능(객체의 기능이 확장이 된다.)

// 인터페이스 상속 : implements(구현하다)
// -> 부모가 이름만 있는 미완성 기능을 물려줌
// 자식이 이름만 잇는
public class HSH implements KH{

	@Override
	public void lesson() {
		// TODO Auto-generated method stub
		System.out.println("A강의장에서 풀스택 웹개발 과정 수강");
	}
	
	
}
