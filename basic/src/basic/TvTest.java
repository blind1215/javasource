package basic;

import jdk.nashorn.api.tree.SimpleTreeVisitorES5_1;

public class TvTest {

	public static void main(String[] args) {
		
		//인스턴스(객체) 생성-쓸라고 만듬=> 생성자를 불러낸다 
		TV t1=new TV(); //메모리에 객체가 들어간다 //()안에 아무것도 없다면 default 생성자 호출
		TV t2=new TV(true,11,153);
		
//		System.out.println("t1 채널 값: "+t1.channel);
//		
//		t1.channel = 8;
//		System.out.println("t1 채널 값: "+t1.channel);
		
		t1.channelUP();
		
		//리턴 타입이 있는 메소드를 호출
		
		//처리방법 1 => 출력문에서 확인하기
		System.out.println(t1.getChannel()); //마우스올렸을때 void가 아닌 타입이면 sysout가능함
		
		//처리방법 2 => 넘어오는 값 받기 
		int channel_no = t1.getChannel();
		// 받아서 다른 처리가 가능함
		
		//리턴타입이 없는 메소드 처리 :void
		//호출만 가능
		t1.channelUP();
		//System.out.printfln(t1.chnnelDown());이렇게 출력못함 받기만 할수있다//메소드가 가지고있는 ++작업만 이루어진다
		
		
		

	}

}
