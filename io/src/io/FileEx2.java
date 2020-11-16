package io;

import java.io.File;
import java.io.IOException;

public class FileEx2 {

	public static void main(String[] args) throws IOException {
		File f = new File("c:\\temp\\InputStreamEx1.java"); //윈도우로 접근하기위해서 경로지정하면서 객체생성
		
		String fileName =  f.getName();
		int pos = fileName.lastIndexOf(".");//.의위치를 찾아줘
		
		System.out.println("경로를 제외한 파일명 :" + f.getName());
		System.out.println("확장자를 제외한 파일명 : "+fileName.substring(0,pos));
		System.out.println("확장자 : "+fileName.substring(pos+1));
		
		System.out.println("경로를 포함한 파일명 :" +f.getPath());
		System.out.println("파일의 절대 경로 : "+f.getAbsolutePath());
		System.out.println("파일의 정규 경로 : "+f.getCanonicalPath());
		System.out.println("파일이 속해 있는 디렉토리 : "+f.getParent());
		System.out.println();
		System.out.println("File.pathSeparator - "+File.pathSeparator);
		System.out.println("File.pathSpearatorChar - "+File.pathSeparatorChar);
		System.out.println("File.separator - " +File.separator);
		System.out.println("File.separatorChar - "+File.separatorChar);
		System.out.println();
		System.out.println("uer.dir = "+System.getProperty("user.dir"));//현재 경로 
		
		

	}

}
