import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int first;
		int push;
		int second;
	
		int result;
		
		System.out.print("ù��° ����� ���� �Է��ϼ��� : ");
		first = s.nextInt();
		System.out.print("���� ��ȣ�� �����ϼ��� 1)���� 2)���� 3)���� 4)������");
		push = s.nextInt();
		System.out.print("�ι�° ����� ���� �Է��ϼ��� : ");
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
					System.out.printf(" %d �� %d = %d \n", first,second,result);
				}
				else  {
					System.out.println(" 0�� �����������ϴ�.");
				}
			}  else
				System.out.println("�߸��� ��ȣ�� �����ŰŰ��ƿ� �ٽý������ּ���");
		
		
	}

}
