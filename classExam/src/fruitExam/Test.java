package fruitExam;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitSeller seller = new FruitSeller(20,1000,0);
		FruitBuyer buyer = new FruitBuyer(5000);
		seller.showSaleResult();
		buyer.showBuyResult();
		buyer.buyApples(seller,2000);
		seller.showSaleResult();
		buyer.showBuyResult();
	}

}
