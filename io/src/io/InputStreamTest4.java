package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamTest4 {

	public static void main(String[] args) {
		//바이트 기반의 InputStream 생성
		InputStream in = System.in;//키보드와 연결함 
		//바이트 기반의 OutputStream 생성
		OutputStream out = System.out; //모니터로 연결
		
	
		
		//입력 스트림에서 바이트 배열로 읽어오기
		byte[] b = new byte[100];
		
		
		try {
			while(in.read(b)!=-1) {//무조건 예외가 생김
				//System.out.println((char)input); 
				out.write(b);
				
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
