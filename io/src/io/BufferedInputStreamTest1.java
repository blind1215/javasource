package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInputStreamTest1 {

	public static void main(String[] args) {
		try(InputStream in = new FileInputStream("c:\\temp\\file1.txt");//읽기
				BufferedInputStream bis =new BufferedInputStream(in);//보조스트림 
				OutputStream out = new FileOutputStream("c:\\temp\\file1_copy3.txt");//출력하기
				BufferedOutputStream bos = new BufferedOutputStream(out)){//보조스트림
					
				int data=0;
				while((data=in.read())!=-1) {
					bos.write(data);
				}
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
