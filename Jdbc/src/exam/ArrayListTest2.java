package exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>();
		
		list.add(new Member(1234,"홍길동"));
		list.add(new Member(1235,"박길동"));
		list.add(new Member(1236,"김길동"));
		list.add(new Member(1237,"최길동"));
		list.add(new Member(1238,"이길동"));
		
		for(Member mem:list) {
			System.out.println(mem);
		}
	}

}
