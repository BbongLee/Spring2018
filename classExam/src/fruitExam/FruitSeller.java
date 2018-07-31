package fruitExam;

public class FruitSeller {
	private int numOfApples;
	private int applePrice;
	private int myMoney;
	
	public FruitSeller(int numOfApples, int applePrice, int myMoney) {
		super();
		this.numOfApples = numOfApples;
		this.applePrice = applePrice;
		this.myMoney = myMoney;
	}
	
	public int saleApples(int money){
		int num = money / applePrice;
		numOfApples -= num;
		myMoney+=money;
		return num;
	}
	
	public void showSaleResult(){
		System.out.println("¾ÆÀú¾¾ÀÇ »ç°ú °³¼ö : "+numOfApples);
		System.out.println("¾ÆÀú¾¾ ³²Àº µ· : "+myMoney);
	}

	public int getNumOfApples() {
		return numOfApples;
	}

	public void setNumOfApples(int numOfApples) {
		this.numOfApples = numOfApples;
	}

	public int getApplePrice() {
		return applePrice;
	}

	public void setApplePrice(int applePrice) {
		this.applePrice = applePrice;
	}

	public int getMyMoney() {
		return myMoney;
	}

	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}
	
	
}
