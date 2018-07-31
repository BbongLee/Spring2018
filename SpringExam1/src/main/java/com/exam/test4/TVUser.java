package com.exam.test4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		//스프링 실행환경 객체를 만듦!!!!
		ApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");
				
		TV tv = (TV)ctx.getBean("tv");// ---> 티비밖에모름, 삼성엘지모름->런타임시 run -> configurations -> argument에서 정보 줌.
		//다형성
		tv.turnOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.turnOff();
		
	}

}
