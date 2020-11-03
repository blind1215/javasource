
public class Ex_02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =100;// int : 숫자가 될것이다 /상수 a에 변수 100을 초기화해준다
		int b = 50; // 숫자 int / b의값 50으로 초기화
		int result; //정수형 변수 result를 선언
		
		result = a+b;
		System.out.println(a + "+" + b +  "=" + result);

		result = a - b;
		
		System.out.println(a + "-" + b + "=" + result);

		result = a * b;
		
		System.out.println(a + "x" + b + "=" + result);
		
		result = a / b;
		System.out.println(a + "÷" + b + "=" +result);
		
		result = a % b;
		System.out.println(a + "%" + b + "=" + result);
	}


}
