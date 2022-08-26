package edu.kh.io.model.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class IOService {

	// 스트림 : 데이터가 이동하는 통로
	
	// 바이트 기반 스트림 : 1byte단위로 데이터를 입/출력하는 스트림.
		// -> 문자가 아닌 파일(이미지, 영상, exe 등) 입/출력
	
	// 문자 기반 스트림 : 문자 단위(2byte)로 데이터를 입/출력하는 스트림.
	// -> 문자 데이터(채팅, 코드, 데이터) 입/출력
	
	
	public void output() {
		
		String content = "Hello world\n"
						+ "1234567890\n"
						+ "오늘은 금요일 입니다."
						+ "점심 어떤게 좋을까요?";
		// * 스트리 객체 생성 시 예외처리가 필요함
		// 
		
		// 바이트 기반 파일 출력 스트림
		FileOutputStream fos = null; // 메서드의 지역변수 == 메서드 어디서든 사용가능
									 // --> finally에서도 사용가능
		
		
		// 문자 기반 파일 출력 스트림
		FileWriter fw = null;
		
		try {
			fos = new FileOutputStream("byte/byteTest.txt", true);
				// new FileOutputStream("출력할 파일 경로", 이어쓰기여부);
				// -> 파일이 없으면 생성됨
				// 새롭게 실행ㄷ 될 때 마다 파일/내용 덮어쓰기가 된다.
				// 이어쓰기 여부를 true로 하면 이전 내용에 이어쓰기가 된다.(log 작성 시 많이 사용)
			
				// 1byte씩 파일로 출력
			for(int i=0; i<content.length(); i++) {
				fos.write(content.charAt(i));
			} 
			
			
			System.out.println("바이트 스트림 출력 완료");
			
			// ------------------------
			fw = new FileWriter("char/charText.txt", true);
			// new FileWriter("출력할 파일 경로");
			// -> 파일이 없으면 생성됨
			
			fw.write(content);
			
			System.out.println("문자 스트림 출력 완료");

			
		} catch(FileNotFoundException e) {
			e.printStackTrace(); // 예외가 발생한 메서드까지의 모든 메서드 출력
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}finally {
			
			try {
				
				// 스트림.close() : 
				// 스트림 내부에 존재하는 데이터를 모두 밀어낸 후!
				// 스트림 객체 자원(메모리) 반환 
				// -> 필수 작성!
				fos.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
