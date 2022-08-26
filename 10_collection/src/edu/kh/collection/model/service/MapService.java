package edu.kh.collection.model.service;

import java.util.HashMap;
import java.util.Map;

import edu.kh.collection.model.vo.Student;

public class MapService {
	
	/* Map : key와 value 한 쌍이 데이터가 되어 이를 모아둔 객체
	 * 
	 * - key : Map에 저장된 데이터를 구분하는 용도
	 * 		  -> Set의 특징을 지님
	 * 			(순서 X, 중복 X, equals(), hashCode() 오버라이딩 필요)
	 * - value : Map에 실제 저장된 값을 의미
	 * 		  -> List의 특징을 지님(중복 O)
	 * 
	 * 
	 * 
	 */
	
	public void ex1() {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Map.put(key, value) : Map에 추가
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "이길동");
		map.put(5, "박길동");
		map.put(6, "최길동");
		
		// key 중복
		map.put(1, "홍홍홍");  // 홍길동 -> 홍홍홍으로 변경(덮어쓰기)
		
		// value 중복
		map.put(7, "최길동"); // 키값때문에 값이 똑같아도 중복 허용
		
		System.out.println(map.toString());
		
	}
	
	public void ex2() {
		
		// Map은 언제 사용하면 좋은가? 
		
		// 1) 재사용이 적은 VO를 대체하는 경우 >> 1회성으로 Map 사용
		// 2) 한번에 다량의 데이터를 전달하는 경우
		//    데이터의 명확한 구분을 위해서 사용
		
		
		
		// key   value
		// name  "홍길동"
		// age   "10
		// gender 'M'
		
		// Student -> Map으로 변경해서 사용
		
		Student std = new Student();
		Map<String, Object> student = new HashMap<String, Object>();
		// 다형성 적용, String name char 등등 멤버변수가 다양
		
		// 값 추가
		std.setName("홍길동"); // vo
		student.put("name", "홍길동"); // map
		
		std.setAge(15);
		student.put("age", 15);
		
		std.setAddress("서울시 중구");
		student.put("address", "서울시 중구");
		
		std.setGender('남');
		student.put("gender", '남');
		
		std.setScore(100);
		student.put("score", 100);
		
		System.out.println(std);
		System.out.println(student);
		
		// 새로운 필드의 추가 Map 유리, vo사용빈도가 적을 때 Map사용에 좋다
		// vo= 100줄짜리 클래스, 몇번안쓰면 메모리 아깝다.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
