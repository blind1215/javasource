import java.util.Scanner;

public class Ex_02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); //�ý����� �Է¹ްڴ�
		
		int first;
		int second;
		int result;
		//������ ���ڸ� �����ϴ� ������ ��� 
		
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		first=s.nextInt(); //ù��°��� �������� ������ ���ڰ��� �Է¹ްڴ�
		
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		second =s.nextInt(); //�ι�°��� �������� ������ ���ڰ��� �Է¹ްڴ�
		
		
		result = first+second;
		//����Ʈ��� ���� ù��° ���� �ι�° ���� ���Ѱ��̵ȴ�
		
		System.out.printf("���� ���� : %d + %d = %d\n", first,second,result);
		
		result = first-second;
		System.out.printf("���� ���� : %d - %d = %d\n", first,second,result);
		
		result = first * second;
		System.out.printf("���� ���� : %d x %d = %d\n", first,second,result);
		
		result = first/second;
		System.out.printf("���� ���� : %d �� %d = %d\n", first,second,result);
		
	}


}
