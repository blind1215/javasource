import java.util.Scanner;

public class Ex_02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); // ���� ���� �����ִ°� �ƴ϶� ���� ����� ���� �����ϰ��Ѵ�
		int first = 0; 
		int second = 0; //first, second�� ���ڴ����̶�°��� ��Ÿ���� ���� 0���� �ʱ�ȭ���ش�
		int result; // result��� �������� �������ش� 
		
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		first = s.nextInt(); // �Է��Ұ� first�� ���ڷ� �Է��� �����޴´ٰ� �����Ѱ�
		
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		second = s.nextInt();  // second���� �Է¹����� �ι�°���� second�� �ǹ��Ѵ� 
		
		result = first + second;// ����Ʈ�� ǥ���Ұ��� �������ش�
		System.out.print(first + "+" + second +"=" + result); // ����� ������ �Է��ϵ� ��������� ""�� �ٿ��ش�		
	}

}
