package fruitExam;

public class FruitBuyer {
	private int myMoney;
	private int numOfApples;
	
	public void buyApples(FruitSeller seller, int money){//아저씨가 있어야지 사과 살 수있움
		numOfApples+=seller.saleApples(money);//위임, 메소드를 통해 다른 객체에 접근
		myMoney-=money;
	}
	
	public void showBuyResult(){
		System.out.println("사는 사람 남은 돈 : "+myMoney);
		System.out.println("갖게 된 사과의 개수 : "+numOfApples);
	}
	
	public FruitBuyer(int myMoney) {
		super();
		this.myMoney = myMoney;
		this.numOfApples = 0;
	}

	public int getMyMoney() {
		return myMoney;
	}

	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}

	public int getNumOfApples() {
		return numOfApples;
	}

	public void setNumOfApples(int numOfApples) {
		this.numOfApples = numOfApples;
	}
	
	
}
