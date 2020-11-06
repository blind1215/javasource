import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		//Homework2와 동일한 문제 (while문으로)
		
		int first,i=1;
		Scanner s = new Scanner(System.in);
	
		
		System.out.print("출력할 단을 숫자로 입력해주세요 : ");
		first = s.nextInt();
		
		while (i < 10) {
			System.out.printf("%d x %d = %d \n", first,i,first*i);
			i++;
		}

	}

}
