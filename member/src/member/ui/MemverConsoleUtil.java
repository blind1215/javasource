package member.ui;

import java.util.Scanner;

import member.domain.MemberVO;

public class MemverConsoleUtil {
	public MemberVO getAddMember(Scanner sc) {
		System.out.println("등록할 회원 정보를 입력하세요");
		
		System.out.println("이름: ");
		String name =sc.next();
		System.out.println("주소: ");
		String addr =sc.next();
		System.out.println("이메일: ");
		String email =sc.next();
		System.out.println("국가: ");
		String nation =sc.next();
		System.out.println("나이: ");
		int age = sc.nextInt();
		return new MemberVO(name,addr,nation,email,age);
	}
	public void printAddSuccessMessage(String name) {
		System.out.println(name + "회원 정보 추가 성공");
	}
}
