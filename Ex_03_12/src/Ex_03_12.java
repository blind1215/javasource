
public class Ex_03_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a,b,c,d,e;
		
		a = 'A';
		System.out.printf("문자로는 %c이다 \t",a);
		System.out.printf("10진수로는 %d 이다 \n",(int)a);
		
		b = 'a';
		c = (char)(b + 1);
		
		System.out.printf("문자표현 %c \t",b);
		System.out.printf("10진수표현 %d \t", (int)b);
		System.out.printf("16진수표현 %x \t", (int)b);
		System.out.printf("8진수표현 %o \n",(int)b);
		
		d = 'b';
		
		System.out.printf("10진수 %d \n",(int)d);
		System.out.printf("문자표현 %c \t", c);
		System.out.printf("10진수 %d \n", (int)c);
		
		e = '가';
		System.out.printf("문자 %c,10진수 %d,8진수 %o, 16진수 %x \n", e,(int)e,(int)e,(int)e);
	}

}
