import java.io.IOException;
import java.util.Scanner;

public class Homwork {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in); //입력받을 값을 선언
		
		char a,c; //문자형 a와 c를 선언
		int b; // 정수형 b를 선언
		
		System.out.print("알파벳을 입력해주세요 : "); //입력하란말을 출력한다
		a = (char)System.in.read(); //  a에 입력받은 문자를 대입 

		b = a-32; // 정수 b는 입력받은 알파벳 a의 아스키코드 -32한값이 숫자로 대입된다
		
		c = (char)b; // c 는 아스키코드로 표시된 b를 문자형으로 강제로 변형하여 문자로 표시해준다
		
	
		
		System.out.println (c);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
