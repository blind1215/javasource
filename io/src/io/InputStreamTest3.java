package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamTest3 {

	public static void main(String[] args) {
		//바이트 기반의 InputStream 생성
		InputStream in = System.in;//키보드와 연결함 
		//바이트 기반의 OutputStream 생성
		OutputStream out = System.out; //모니터로 연결
		
		//ASCII 코드 (영어,숫자) 한글은 부여가 안되어 있음
		//키보드의 모든 키들은 특정 숫자값이 부여되어있음
		// A : 65, a:97
		int input=0;
		
		//입력 스트림에서 한 바이트씩 읽어오기
		try {
			while((input=in.read())!=-1) {//무조건 예외가 생김
				//System.out.println((char)input); 
				out.write(input);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) { //통로를 열어서 다쓰면 닫아주어야하고 트라이캐치로 잡아줌
				e.printStackTrace();
			}
			
		}
		
		

	}

}
