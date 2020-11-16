package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferedReaderTest2 {

	public static void main(String[] args) {
		// 바이트기반 스트림을 문자기반 스트림으로 연결
		try(InputStreamReader reader = 
				new InputStreamReader
				(new FileInputStream("c:\\temp\\file1.txt"))) {
			//이클립스 인코딩 : utf -8 / 메모장에 적은 파일 ansi 저장
			int data = 0;
			while((data=reader.read())!=-1)	{
				System.out.print((char)data);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}



	}

}
