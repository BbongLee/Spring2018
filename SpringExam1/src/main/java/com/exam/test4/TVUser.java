package com.exam.test4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		//������ ����ȯ�� ��ü�� ����!!!!
		ApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");
				
		TV tv = (TV)ctx.getBean("tv");// ---> Ƽ��ۿ���, �Ｚ������->��Ÿ�ӽ� run -> configurations -> argument���� ���� ��.
		//������
		tv.turnOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.turnOff();
		
	}

}
