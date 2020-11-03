import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int first;
		int push;
		int second;
	
		int result;
		
		System.out.print("첫번째 계산할 값을 입력하세요 : ");
		first = s.nextInt();
		System.out.print("수식 번호를 선택하세요 1)덧셈 2)뺄셈 3)곱셈 4)나눗셈");
		push = s.nextInt();
		System.out.print("두번째 계산할 값을 입력하세요 : ");
		second = s.nextInt();
		
		if (push == 1) {
			result = first + second;
			System.out.printf(" %d + %d = %d \n", first,second,result );
		}	
			else if (push == 2) {
				result = first - second;
				System.out.printf(" %d - %d = %d \n", first,second,result);
				
			} else if (push == 3) {
				result = first *second;
				System.out.printf(" %d x %d = %d \n", first,second,result);
			} else if (push == 4 ) {
				if (second!=0) {
				result = first / second;
					System.out.printf(" %d ÷ %d = %d \n", first,second,result);
				}
				else  {
					System.out.println(" 0은 나눌수없습니다.");
				}
			}  else
				System.out.println("잘못된 번호를 누르신거같아요 다시실행해주세요");
		
		
	}

}
