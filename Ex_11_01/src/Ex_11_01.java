
public class Ex_11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
		myCar1.color = "red";
		myCar1.speed = 20;
		
		Car myCar2 = new Car();
		myCar2.color = "blue";
		myCar2.speed = 0;
		
		Car myCar3 = new Car();
		myCar3.color = "black";
		myCar3.speed = 0;


		myCar1.upSpeed(200);
		System.out.println("1번차의 색은 "+ myCar1.color + "이며, 현재 시속은" + myCar1.speed +"입니다");
	}

}
