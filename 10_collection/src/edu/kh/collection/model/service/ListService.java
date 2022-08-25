package edu.kh.collection.model.service;

import java.util.ArrayList;

import edu.kh.collection.model.vo.Student;

public class ListService {

	/* List : 자료들을 순차적으로 나열한 자료 구조 (배열과 비슷함)
	 * --> [Interface] 
	 * 
	 * - 인덱스를 이용해 순서 유지
	 * - 중복 값 저장 가능(인덱스 번호로 구분이 가능하기 때문에)
	 *  
	 * - List를 상속받아 구현한 클래스
	 *   -> ArrayList, LinkedList, Vector(잘 쓰진 않음)
	 * 
	 * 
	 * 
	 */
	
	public void ex1() {
		
		// 컬렉션(List) 사용법
		// - 특징
		// 1) 크기 제약이 없다.
		// 2) 추가, 삭제, 수정, 정렬 등의 기능이 구현되어 있다.
		// 3) 여러 타입의 객체를 저장할 수 있다. (여러 타입을 저장하려고 object형)
		//    ---> Object 참조 변수의 묶음
		//    --- ? instanceof로 확인하고 다운캐스팅을 해야 한다.
		
		// java.util 패키지
//		ArrayList list = new ArrayList(); // 기본 생성자 -> 10칸짜리 생성
		
		ArrayList list = new ArrayList(3); // 3칸짜리 생성
		
		// add(E e) : 리스트에 마지막 위치에 객체 추가
		list.add( new Object() );
		list.add( new Student() );
		list.add( new String() );
		
		
		// 0825 2교시 
		// ArrayList의 크기 3을 초과해서 추가
		list.add(new String("초과")); // 크기가 자동으로 변함을 확인
		
		// add(int index, E e ) : index 위치에 E 객체를 추가
		list.add(1,new Student("홍길동", 15, "강남구", '남', 60));
		
		// set (int index, E e) = = 반환값 : 이전에 있던 값 / 
		// 이전에 있던 값 빼고 새로운 값으로 대체
		// 제대로 사용하면 이전 값과 이후 값을 둘 다 살릴 수 있다.
		// index위치를 E 객체로 수정, 원래 위치하던 객체를 반환
		Object str = list.set(4, new String("수정된 문자열"));
		// ArrayList == object[] 이기 때문에 String == 로 반환받을 수 없다.
		// Object로 해야함
		
		//  remove(int index) : index위치의 객체를 제거(사실 꺼내서 반환)
		
		Object student = list.remove(2);
		
		
		// size() : List에 저장된 요소의 개수를 반환
		// get(int index) : index에 위치한 객체를 얻어옴
		
		for(int i = 0 ; i < list.size(); i++) {
			// 얻어온 요쇼가 Student이면 학생의 이름을 출력하겠다.
			
			if(list.get(i) instanceof Student) {
				System.out.println(   ( (Student)list.get(i) ).getName()   );
			}  // list.get(i).getName() >> XX
		}
		
		
		
		System.out.println("종료");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
