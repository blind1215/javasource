package exception;
/*Exception �� Error(�ذ� ���� - ��ǻ�ʹٿ�...)
 * 
 *Exception(����)
 *������ ���� - �ڵ��� ��Ÿ���� ����(��Ŭ�������� �˷���)
 *��Ÿ�� ���� - �����Ҷ� ��Ÿ���� ���ܻ���
 * 
 */
public class ExceptionTest {
//throws �ϰ�ó���� �ڹٴϰ�
	public static void main(String[] args) {
		//������ ����
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace(); 
			//e.printStackTrace();��������𼭺��� ���۵Ǿ����� �˷���
			Systme.out.println("�Է°��� Ȯ���� �ּ���");
		}

	}

}
