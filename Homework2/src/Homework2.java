import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		//출력하고 싶은 단을 입력 받고,해당 단을 출력하시오(for문으로)
		int first;
		
		Scanner s =new Scanner(System.in);
		
		System.out.print("출력할 단을 숫자로 입력해주세요: ");
		first = s.nextInt();
		
		
		for (int i = 1 ;i <10 ;i++) {
			System.out.printf("%d x %d = %d\n", first,i,first*i);
			
				
			
		}


	}

}
