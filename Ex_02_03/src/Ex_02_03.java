import java.util.Scanner;

public class Ex_02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); //시스템을 입력받겠다
		
		int first;
		int second;
		int result;
		//세개의 숫자를 지정하는 변수를 등록 
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		first=s.nextInt(); //첫번째라고 지정해준 변수에 숫자값을 입력받겠다
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		second =s.nextInt(); //두번째라고 지정해준 변수에 숫자값을 입력받겠다
		
		
		result = first+second;
		//리절트라는 값은 첫번째 값과 두번째 값의 더한값이된다
		
		System.out.printf("더한 값은 : %d + %d = %d\n", first,second,result);
		
		result = first-second;
		System.out.printf("빼준 값은 : %d - %d = %d\n", first,second,result);
		
		result = first * second;
		System.out.printf("곱한 값은 : %d x %d = %d\n", first,second,result);
		
		result = first/second;
		System.out.printf("나눈 값은 : %d ÷ %d = %d\n", first,second,result);
		
	}


}
