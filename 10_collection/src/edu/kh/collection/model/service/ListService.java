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
		// 3) 여러 타입의 객체를 저장할 수 있다.
		
		// java.util 패키지
//		ArrayList list = new ArrayList(); // 기본 생성자 -> 10칸짜리 생성
		
		ArrayList list = new ArrayList(3); // 3칸짜리 생성
		
		// add(E e) : 리스트에 마지막 위치에 객체 추가
		list.add( new Object() );
		list.add( new Student() );
		list.add( new String() );
		
		System.out.println("종료");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
