package com.exam.test3;

public class TVUser {

	public static void main(String[] args) {
		//Ŭ���̾�Ʈ�� �ش��ϴ� TV������ �ڽ��� �ʿ��� ��ü�� ���� �������� ���ʴ´�.
		//���� �׷��ٸ� Ƽ�� ����� ������ �ҽ��ڵ带 �����ؾߵ��.
		//Ƽ�������� ���� ��ü�� �ʿ��ϴٴ� ���� �����丮���� ��û�������̰�,
		//�����丮�� Ŭ���̾�Ʈ�� ����� Ƽ��ü�� �����ϰ� �����Ͽ� �Ѱ��� ���̴�.
		
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);// ---> Ƽ��ۿ���, �Ｚ������->��Ÿ�ӽ� run -> configurations -> argument���� ���� ��.
		//������
		tv.turnOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.turnOff();
		
	}

}
