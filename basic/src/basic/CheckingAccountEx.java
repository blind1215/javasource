package basic;

public class CheckingAccountEx {

	public static void main(String[] args) {
		// CheckingAccount 객체 생성 후 메소드 테스트
		
		CheckingAccount ac=new CheckingAccount("110-111-1111","김일",20,"2221-2221-1234");
		
		//예금한다
		
		ac.deposit(500000);
		System.out.println("입금하여 남은 잔액은");
		
		//출금한다
		try {
			System.out.println("현재잔액 : "+ac.withdraw(40000));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//직불카드 사용액을 지불한다.
		try {
			System.out.println("직불카드 사용 후 잔액:"+ac.pay("222-222-22",500000));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}
}

