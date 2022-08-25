package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.collection.model.vo.Student;

public class StudentService {
	
	// 부모 타입 참조 변수 List 
	private List<Student> stdList = new ArrayList<Student>();
			// Student타입으로 제한된 ArrayList 객체 생성

	public StudentService() {
		stdList.add(new Student("홍길동", 18, "서울시 강남구", 'M', 80));
		stdList.add(new Student("김길순", 17, "서울시 중랑구", 'F', 90));
		stdList.add(new Student("가나다", 19, "경기도 부천시", 'M', 50));
		
	}
	
	/** stdList에 학생 정보 추가 메서드
	 * @param name 
	 * @param age
	 * @param address
	 * @param gender
	 * @param score
	 * @return 
	 * true  : 학생 정보 추가 성공
	 * false : 학생 정보 추가 실패
	 */
	public boolean addStudent(String name, int age, String address, char gender, int score) {
		
		
		
		
		
//		// 제네릭 확인 테스트
//		List test1 = new ArrayList() ;
//		
//		List<String> test2 = new ArrayList<String>() ;
//		
//		List<Integer> test3 = new ArrayList<Integer>() ;
		
//		List<Student>
		// List.add(Student e) 이렇게 됨
		
		// List.add(E e) : 제네릭<E>에 작성되는 타입으로 모든 E가 변화함
//		test1.add(Object e); // test1.add(Object e) -> 타입 제한 X , 모든 참조 변수가 Object타입
//		test2.add(address);; // test2.add(String e) -> 타입 제한 O, 모든 참조 변수가 String타입
//		test3.add(null); // test3.add(Integer e) -> 타입 제한 O, 모든 참조 변수가 Integer타입
		
		Student std = new Student(name, age, address, gender, score);
		
		
		// add(Student e)
		// boolean add(Student e ) : add() 결과로 boolean 반환
		return stdList.add(std);
				// true > 반환(return)
				
				
				
		
		
		
		
	}

	/** 학생 전체 조회시 stdList 반환 메서드
	 * @return stdList
	 */
	public List<Student> getStdList() {
		return stdList;
		
	}

	
	/** 학생 정보 수정 메서드
	 * 
	 * @param idx
	 * @param address
	 * @param score
	 * @return 
	 * true : 인덱스가 일치하는 학생정보 수정시
	 * false : 인덱스가 일치하는 학생이 없을 시
	 */
	public boolean updateStudent(int idx, String address, int score) {
		
		// 입력받은 idx가 stdList에 실제 존재하는 요소의 인덱스 범위를 넘어선 경우
		if( idx >= stdList.size() || idx <0) {
			return false;
			
			
		} else {
			stdList.get(idx).setAddress(address);
			stdList.get(idx).setScore(score);
			// 입력받은 idx와 일치하는 stdList의 인덱스 번호를 얻어와서 
			// 전달받은 주소로 주소를 세팅하겠다.
			
			return true;
		}
		
		
	}

	/** 학생 정보 제거
	 * @param idx
	 */
	public Student removeStudent(int idx) {
		
		// 일치하는 인덱스가 있으면 
		// 해당 학생 정보를 sdtList에서 제거하고
		// 제거된 학생 정보를 반환(return)
		
		// 일치하는 인덱스가 없다면 null 반환
		
		if(idx <0 || idx >= stdList.size()) { // 
			return null;
			
		} else {
			// 리스트에서 제거된 요소를 반환
			return stdList.remove(idx);
		}
		
		
	}
	
	/** 일치하는 이름 검색
	 * @param name
	 * @return resultList
	 */
	public List<Student> selectStudent1(String name) {
		
		List<Student> resultList = new ArrayList<Student>();
		
		// 향상된 for문
		for(Student s : stdList ) {
			
			if( s.getName().equals(name)) { // 검색한 이름과 학생 이름이 동일한경우
				
				resultList.add(s); // s가 참조하고 있는 것을 resultList에 넣겠다.
				
			}
			
		}
		
		
		
		
		
		
		return resultList;
	}

	/** 포함하는 이름 검색
	 * @param name
	 * @return resultList
	 */
	public List<Student> selectStudent2(String name) {
		List<Student> resultList = new ArrayList<Student>();
		
		// 향상된 for문
		for(Student s : stdList ) {
			
			// 검색한 이름과 학생 이름에 포함되어 있는 경우
			if( s.getName().contains(name)) {
				//String.contains(값) : 문자열에  값이 포함되어
				
				
				resultList.add(s); // s가 참조하고 있는 것을 resultList에 넣겠다.
				
			}
			
		}
		return resultList;

	}
}