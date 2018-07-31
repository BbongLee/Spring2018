package goodCookExam;

public class CookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICook cook = new KoreanCook();
		//생성자를 이용해 코리안쿡 주입해줌
		CookManager manager = new CookManager(cook);
		manager.orderRice();
		manager.orderSoup();
		//세터를 이용해 차이니즈쿡 주입해줌ㅁ
		ICook cook1 = new ChineseCook();
		manager.setCook(cook1);
		manager.orderRice();
		manager.orderSoup();
	}

}
