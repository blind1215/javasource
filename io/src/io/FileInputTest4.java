package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputTest4 {

	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream(new File("c:\\temp\\lol.mp3"));
			out = new FileOutputStream(new File("c:\\temp\\lol_copy.mp3"));
			
			
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
		}finally {
			try {
				in.close();
				out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
