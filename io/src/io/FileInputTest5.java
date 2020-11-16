package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputTest5 {

	public static void main(String[] args) {
		//try~with~resource
		//AutoClosable을 구현한 객체만 사용이 가능
		try(InputStream in = new FileInputStream(new File("c:\\temp\\lol.mp3"));
				OutputStream out = new FileOutputStream(new File("c:\\temp\\lol_copy.mp3"));) {
						
			
			long start = System.currentTimeMillis();
//			int data =0;
//			while((data=in.read())!=-1)	{//byte단위로 가져옴
//				out.write(data);
			byte[] b = new byte[1024];
			while(in.read(b)!=-1) { //배열로 가져옴 빠름
				out.write(b);
			}
			long end = System.currentTimeMillis();
			System.out.println("복사하는 데 걸린 시간 : "+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
