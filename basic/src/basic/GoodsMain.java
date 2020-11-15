package basic;

public class GoodsMain {

	public static void main(String[] args) {
		//GoodsStock 5개 생성하기 
		GoodsStock gs1= new GoodsStock("s1506",10);
		GoodsStock gs2= new GoodsStock("s1507",20);
		GoodsStock gs3= new GoodsStock("s1508",30);
		GoodsStock gs4= new GoodsStock("s1509",40);
		GoodsStock gs5= new GoodsStock("s1510",50);
		
		//재고수량 증가,감소 실행시키기
		gs1.addStock(20);
		System.out.println("현재 재고 수량: "+gs1.subtractStock(5));
		
		//
		gs2.addStock(10);
		System.out.println("현재 재고 수량: "+gs2.subtractStock(10));
		
		
		
	
	
	}

}
