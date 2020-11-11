package exam;

import java.util.ArrayList;
import java.util.List;

/* 데이터를 어디에 담을 것인가? 기본형타입, 클래스(객체) 타입
 * 
 * 기본형 : int, float,double,char 
 * 객체: Integer,Float,Double,String,....
 * 
 * 데이터가 많아질때 : 배열,Collection(List,Set),Map
 * 
 * List : ArrayList,LinkedList,
 */

public class ArrayListTest1 {

	public static void main(String[] args) {
		// List객체 생성
		List<String> list = new ArrayList<String>(); //객체 생성
		
		//생성된 list에 요소 추가
		list.add("java");
		list.add("JDBC");
		list.add("oracle");
		list.add("html");
		
		//요소확인
		for(String str:list) {
			System.out.println(str);
			/*for(int 1=0;i<list.size();i++) {
			 * Sytem.out.println(list.get(i));
			 * } 이걸로해도
			 */	
		}
		
		System.out.println();
		//특정 요소 확인
		System.out.println(list.get(2));
	}

}
