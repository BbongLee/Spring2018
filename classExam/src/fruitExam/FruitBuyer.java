package fruitExam;

public class FruitBuyer {
	private int myMoney;
	private int numOfApples;
	
	public void buyApples(FruitSeller seller, int money){//�������� �־���� ��� �� ���ֿ�
		numOfApples+=seller.saleApples(money);//����, �޼ҵ带 ���� �ٸ� ��ü�� ����
		myMoney-=money;
	}
	
	public void showBuyResult(){
		System.out.println("��� ��� ���� �� : "+myMoney);
		System.out.println("���� �� ����� ���� : "+numOfApples);
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
