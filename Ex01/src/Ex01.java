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
			
			System.out.print("ù��° ����: ");
			one = s.nextInt();
			
			System.out.print("�ι�° ����: ");
			two = s.nextInt();
			
			System.out.print("����° ����: ");
			three = s.nextInt();
			
			System.out.print("�׹�° ����: ");
			four = s.nextInt();
			
			result = one+two+three+four;
			System.out.printf("�׼��� ���� �� : %d \n", result);

	}

}
