package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx4 {

	public static void main(String[] args) {
		try {
			File temp = new File("c:\\temp");
			File dir = new File("c:\\temp\\dir");
			File file1 = new File("c:\\temp\\file1.txt");
			File file2 = new File("c:\\temp\\file2.txt");
			File file3 = new File(temp,"file3.txt");
			File file4 = new File("c:\\temp\\file4.txt");
			
			//디렉토리 생성
			if(!dir.exists()) {
				dir.mkdir();//dir이 없으면 생성해라
			}
			//파일생성
			if(!file1.exists()) file1.createNewFile();
			if(!file2.exists()) file2.createNewFile();
			if(!file3.exists()) file3.createNewFile();
			if(!file4.exists()) file4.createNewFile();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a HH:mm");
			System.out.println("    날짜        시간        형태        크기        이름");
			System.out.println("----------------------------------------------------");
			
			File contents[] = temp.listFiles();
			for(File f:contents) {
				System.out.println(sdf.format(new Date(f.lastModified())));//최초수정된 날짜를 가지고와라 
				if(f.isDirectory()) {
					System.out.println("\t<DIR>\t\t\t"+f.getName());
				}else {
					System.out.println("\t\t\t"+f.length()+"\t"+f.getName());
				}
				System.out.println();
				
			}
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
