package com.exam.test1;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ｚ�� ������ �޼ҵ� �ñ״��İ� �ٸ��Ƿ�
		//Ƽ������ �ڵ� ��κ��� �����ؾ� Ƽ�� ��ü�A ��  �ִ�.
		//������¿����� �� Ƽ��Ŭ������ ���� �޼ҵ带 �����Բ�
		//������ ��� ���ܵ� ����. ���� Ƽ�������� ���� Ŭ���̾�Ʈ �����׷������� �ϳ����ƴ϶� 
		//��������� ���������� �� ��������!!
		//Ƽ��ü�� �� �����!!!
		
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		LgTV tv = new LgTV();
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff(); 
	}

}
