import java.io.IOException;
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) throws IOException {
		// 소문자 하나를 입력받고 , 해당 소문자를 대문자로 출력하시오.
		int first='a';
		System.out.println(first);
		int second ='A';
		System.out.println(second);
		
		System.out.println(first-second);
		System.out.println("==================================");
		
		Scanner s = new Scanner(System.in);
		
		char ch1,ch2;
		int a;
		System.out.print("알파벳을 입력하세요 :  ");
		ch1 = (char)System.in.read(); //ch입력받은 문자를 읽어오겠다 예외처리로 던진다 io오류
		
		a = ch1-32;
		
		ch2 = (char)a;
		
		System.out.print(ch2);
	}

}
