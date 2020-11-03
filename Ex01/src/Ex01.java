import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			
			int one;
			int two;
			int three;
			int four;
			int result;
			
			System.out.print("첫번째 숫자: ");
			one = s.nextInt();
			
			System.out.print("두번째 숫자: ");
			two = s.nextInt();
			
			System.out.print("세번째 숫자: ");
			three = s.nextInt();
			
			System.out.print("네번째 숫자: ");
			four = s.nextInt();
			
			result = one+two+three+four;
			System.out.printf("네수의 합의 값 : %d \n", result);

	}

}
