package interfaceExam;

public class Person implements Flyable, Singable{ //has a ����!!!!!!!!!!! be able to !!!!
	//�������̽� : ����, ���˸�

	public void sing() {
		System.out.println("��������~~~ �뷡 �θ���~~~");
	}

	public void fly() {
		System.out.println("�츰 ������ �ϴ��� �� ���� �־�!");
	}

	public void walk(){
		System.out.println("�ѹ� �ѹ� �ɾ��.");
	}
}
