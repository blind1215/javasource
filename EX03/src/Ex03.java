import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int d;
		
		System.out.print("정수를 입력하세요 ==> ");
		d=s.nextInt();
		
		System.out.printf("10진수 ==> %d \n", d);
		System.out.printf("8진수 ==> %o \n", d);
		System.out.printf("16진수 ==> %x\n", d);
		
	}

}
