import java.io.IOException;
import java.util.Scanner;

public class Homwork {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in); //�Է¹��� ���� ����
		
		char a,c; //������ a�� c�� ����
		int b; // ������ b�� ����
		
		System.out.print("���ĺ��� �Է����ּ��� : "); //�Է��϶����� ����Ѵ�
		a = (char)System.in.read(); //  a�� �Է¹��� ���ڸ� ���� 

		b = a-32; // ���� b�� �Է¹��� ���ĺ� a�� �ƽ�Ű�ڵ� -32�Ѱ��� ���ڷ� ���Եȴ�
		
		c = (char)b; // c �� �ƽ�Ű�ڵ�� ǥ�õ� b�� ���������� ������ �����Ͽ� ���ڷ� ǥ�����ش�
		
	
		
		System.out.println (c);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
