package com.exam.test5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		//������ ����ȯ�� ��ü�� ����!!!!
		ApplicationContext ctx = new GenericXmlApplicationContext("applicationContext1.xml");
				
		TV tv = (TV)ctx.getBean("tv");// ---> Ƽ��ۿ���, �Ｚ������->��Ÿ�ӽ� run -> configurations -> argument���� ���� ��.
		//������
		tv.turnOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.turnOff();
		
		TV tv1 = ctx.getBean("tv1", TV.class);
		tv1.turnOn();
		tv1.volumeUp();
		tv1.volumeDown();
		tv1.turnOff();
		
	}

}
