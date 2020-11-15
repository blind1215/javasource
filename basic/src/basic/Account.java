package basic;

import java.util.Scanner;

public class Account {
	//속성 : 계좌번호(110-10-1000),이름,잔액(정수)
	//기능 : 입금한다, 출금한다 => 금액을 받아서 
		
	private String accountNo;
	private String owner;
	private int balance;
	
	


	
	public Account(String accountNo, String owner, int balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}

	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception {
		if(balance < amount)
			throw new Exception("잔액이 부족합니다");

		return balance -= amount;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
