package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class IOTest2 {

	public static void main(String[] args) {
		// 키보드에서 이렵을 받아들여 파일에 출력하는 프로그램 작성
		//조건: 키보드에서 q가 입력되기 전까지 계속 받아들이기	
		String path = System.getProperty("user.dir");
		System.out.println(path);
		try(FileReader reader=new FileReader(path+"\\src\\io\\InputStreamTest1.java");
				BufferedReader br = new BufferedReader(reader)){
			
			String data =null;
			int i =1;
			while((data=br.readLine())!=null) {
				System.out.println((i++)+" "+ data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
//		try(FileReader reader=new FileReader(C:\\Users\\DoGram\\eclipse-workspace\\io\\src\\io\\InputStreamTest1.java);
//				BufferedReader br = new BufferedReader(reader);) {
//			
//			String str = null;
//			while((str=br.readLine())!=null) {
//				bw.newLine();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
		


	}

}
