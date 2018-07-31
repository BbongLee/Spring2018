package goodCookExam;
//CookManager�� ��ü���� �ڸ������̳� ���̴������� ��
//��޴����� �߻����� ICook�� ������
//���� ���յ� => �������� �ߵ�!!!
public class CookManager {
	private ICook cook; //��Ŵ����� ����� ����, �������� (��ü���� Ŭ������ ������������ �������̽��� ��������!!!)
	//�����ڸ� �̿��� ICook ����
	public CookManager(ICook cook){
		this.cook = cook;
	}

	//setter�� �̿��� ICook ����
	public void setCook(ICook cook) {
		this.cook = cook;
	}
	
	public void orderRice(){
		cook.makeRice(); //����, ������ (�ڸ��� ������ ���̴��������� �˸� �ȵ�!!!���⼭!!!!!)
	}
	
	public void orderSoup(){
		cook.makeSoup();
	}
	public void orderSalad(){
		cook.makeSalad();
	}
	public void orderSource(){
		cook.makeSource();
	}
}
