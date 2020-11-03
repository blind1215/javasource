package exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "200";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);//문자형을 정수형태로 변경
		
		System.out.println(value1+value2);
		
		//실행해야 할수있는 런타임에러
		
	}

}
