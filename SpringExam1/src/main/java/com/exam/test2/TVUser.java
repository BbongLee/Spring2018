package com.exam.test2;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ｚ�� ������ �޼ҵ� �ñ״��İ� �ٸ��Ƿ�
		//Ƽ������ �ڵ� ��κ��� �����ؾ� Ƽ�� ��ü�A ��  �ִ�.
		//������¿����� �� Ƽ��Ŭ������ ���� �޼ҵ带 �����Բ�
		//������ ��� ���ܵ� ����. ���� Ƽ�������� ���� Ŭ���̾�Ʈ �����׷������� �ϳ����ƴ϶� 
		//��������� ���������� �� ��������!!
		//Ƽ��ü�� �� �����!!!
		
		TV tv = new SamsungTV(); //��ĳ����
		//���յ��� ���߱� ���� �������� ����
		//tv����Ŭ������ Ƽ���������̽� Ÿ���� ������
		//�ＺƼ�� ����Ƽ�� ��ü�� �����Ѵ�.
		//������ �� ��� ���� Ƽ�� �����ϰ��� �Ҷ�,
		//Ƽ��Ŭ������ü�� �����ϴ� �ҽ��ڵ带 �����ؾ߸� �Ѵ�!!!!
		
		tv.turnOn(); //������ (samsung�� ���� ������ ���� !!!)
		
		SamsungTV tv2 = new SamsungTV();
		tv2.turnOn();
		tv2.volumeUp();
		tv2.volumeDown();
		tv2.turnOff();
		
		LgTV tv1 = new LgTV();
		tv1.turnOn();
		tv1.volumeUp();
		tv1.volumeDown();
		tv1.turnOff(); 
	}

}
