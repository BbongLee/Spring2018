package badCookExam;

public class CookManager {
	// CookManager�� ��ü���� KoreanCook�� �˰�����
	// ���� ���յ�!!! ���� ������!!!!
	//���� ���α׷����� ���� ���յ�, ���� ������!!!!!
	private ICook cook = new KoreanCook(); //��ü������ �˰����� -> ���� �ٲܶ� �������� ��ƴ�, ������ �ٽ��ؾߵȴٴ� �� ���־��ߤ����� ���۰���.!!! 
	
	public CookManager(ICook cook){
		this.cook = cook;
	}
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
