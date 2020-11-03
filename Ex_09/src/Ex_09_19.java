class myChar {
	char x;
	char y;

}


public class Ex_09_19 {

	static void func1(char x, char y) {
		char imsi;
		imsi = x;
		x = y ;
		y = imsi;
		
	}
	static void func2(myChar ch) {
		char imsi;
		imsi =ch.x;
		ch.x = ch.y;
		ch.y = imsi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x  = 'A', y = 'Z';
		System.out.printf("x = %c,y = %c\n", x, y);
		func1(x, y);
		System.out.printf("x = %c , y = %c\n" , x,y);
		
		myChar ch = new myChar();
		ch.x = 'A';
		ch.y = 'Z';
		System.out.printf("x = %c , y = %c\n", x,y);
		func2(ch);
		System.out.printf("x = %c, y = %c\n", ch.x,ch.y);
	}

}
