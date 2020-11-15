package basic;

public class GoodsStock {
	//속성 - 상품코드(g1536), 재고수량(숫자)
	//기능 - 재고를 추가한다, 재고를 감소한다.
	private String goodsCode;
	private int stockNum;
	

	
	public GoodsStock(String goodsCode, int stockNum) { //생성자 만들어줌
		super();
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}

	
	//기능 -재고를 추가한다, 재고를 감소한다
	public void addStock(int amount) {//(매개변수)
		stockNum += amount;
	}
	
	public int subtractStock(int amount) {
		return stockNum -=amount;
	}
	
	
}
