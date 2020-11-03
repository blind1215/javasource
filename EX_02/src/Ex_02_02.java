import java.util.Scanner;

public class Ex_02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); // 내가 값을 직접주는게 아니라 보는 사람이 값을 지정하게한다
		int first = 0; 
		int second = 0; //first, second가 숫자대입이라는것을 나타내며 각각 0으로 초기화해준다
		int result; // result라는 변수또한 선언해준다 
		
		System.out.print("첫번째 값을 입력하세요 : ");
		first = s.nextInt(); // 입력할값 first는 숫자로 입력을 직접받는다고 설정한것
		
		System.out.print("두번째 값을 입력하세요 : ");
		second = s.nextInt();  // second또한 입력받을것 두번째값은 second를 의미한다 
		
		result = first + second;// 리절트가 표시할값을 설정해준다
		System.out.print(first + "+" + second +"=" + result); // 출력할 문구를 입력하되 문자출력은 ""를 붙여준다		
	}

}
