package goodCookExam;

public class CookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICook cook = new KoreanCook();
		//�����ڸ� �̿��� �ڸ����� ��������
		CookManager manager = new CookManager(cook);
		manager.orderRice();
		manager.orderSoup();
		//���͸� �̿��� ���̴����� �������ܤ�
		ICook cook1 = new ChineseCook();
		manager.setCook(cook1);
		manager.orderRice();
		manager.orderSoup();
	}

}
