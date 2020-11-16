package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest1 {

	public static void main(String[] args) {
		//바이트 기반의 InputStream 생성
		InputStream in = System.in;//키보드와 연결함 
		
		//ASCII 코드 (영어,숫자) 한글은 부여가 안되어 있음
		//키보드의 모든 키들은 특정 숫자값이 부여되어있음
		// A : 65, a:97
		
		//입력 스트림에서 한 바이트씩 읽어오기
		try {
			int input = in.read();//무조건 예외가 생김
			System.out.println((char)input); //104 맨앞숫자만 읽었음
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
