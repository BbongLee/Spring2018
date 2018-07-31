package com.exam.test3;

public class TVUser {

	public static void main(String[] args) {
		//클라이언트에 해당하는 TV유저는 자신이 필요한 객체를 직접 생성하지 ㅇ않는다.
		//만약 그랬다면 티비가 변경될 때마다 소스코드를 수정해야딘다.
		//티비유저는 단지 객체가 필요하다는 것을 빈ㅂ팩토리에게 요청했을뿐이고,
		//빈팩토리가 클라이언트가 사용할 티비객체를 적절하게 생성하여 넘겨준 것이다.
		
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);// ---> 티비밖에모름, 삼성엘지모름->런타임시 run -> configurations -> argument에서 정보 줌.
		//다형성
		tv.turnOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.turnOff();
		
	}

}
