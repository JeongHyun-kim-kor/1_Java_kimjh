package edu.kh.collection.model.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetService {

 /* Set(집합)
  *  - 순서를 유지하지 않음 (인덱스 X)
  *  - 중복 데이터 저장 불가 (null도 1개만 저장 가능)
  *   	
  */
	
	public void ex1() {
		
		Set<String> set = new HashSet<String>();
		
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		
		
		// remove(int index) index 없음
		// remove(Object value) 써야 함 : Set에 저장된 객체 중 valuer가 같은 객체 제거
		// -> boolean 반환
		// 제거 되면 ture / 안되면 false
		set.remove("직방"	);
		
		System.out.println(set.toString());
		
		
		
		// set에 저장된 요소 하나씩 얻어오기
		
		// 1. Iterator (반복자)
		
		// - 컬렉션에서 제공하는 컬렉션 객체 반복 접근자
		// -> 컬렉션에 저장된 객체를 임의의 순서로 하나씩 꺼내는 역할
		
		Iterator<String> it = set.iterator();
		
		// Set.iterator();
		// set에 저장된 객체를 이용해서 Iterator 객체를 만들어 반환
		
		while(it.hasNext()) {
			// hasNext? : 다음 값이 존재하면 true
			
			String temp = it.next();
			// next() : 다음 값을 얻어옴
			
			System.out.println(temp);
			
		}
		
		System.out.println("--------------------------------------");
		
		// 2. 향상된 for문
		
		for(String temp  : set ) {
			System.out.println(temp);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
