
public class Ex_03_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a,b,c,d,e;
		
		a = 'A';
		System.out.printf("���ڷδ� %c�̴� \t",a);
		System.out.printf("10�����δ� %d �̴� \n",(int)a);
		
		b = 'a';
		c = (char)(b + 1);
		
		System.out.printf("����ǥ�� %c \t",b);
		System.out.printf("10����ǥ�� %d \t", (int)b);
		System.out.printf("16����ǥ�� %x \t", (int)b);
		System.out.printf("8����ǥ�� %o \n",(int)b);
		
		d = 'b';
		
		System.out.printf("10���� %d \n",(int)d);
		System.out.printf("����ǥ�� %c \t", c);
		System.out.printf("10���� %d \n", (int)c);
		
		e = '��';
		System.out.printf("���� %c,10���� %d,8���� %o, 16���� %x \n", e,(int)e,(int)e,(int)e);
	}

}
