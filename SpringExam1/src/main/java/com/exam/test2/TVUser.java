package com.exam.test2;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삼성과 엘지는 메소드 시그니쳐가 다르므로
		//티비유저 코드 대부분을 수정해야 티비를 교체핤 ㅜ  있다.
		//현재상태에서는 두 티비클래스가 같은 메소드를 가지게끔
		//강제할 어떠한 수단도 없다. 만약 티비유저와 같은 클라이언트 프러그래ㅁㅁ이 하나가아니라 
		//여러개라면 유지보수는 더 힘ㄷ르것!!
		//티비교체도 넘 힘들것!!!
		
		TV tv = new SamsungTV(); //업캐스팅
		//결합도를 낮추기 위해 다형성을 적용
		//tv유저클래스는 티비인터페이스 타입의 변수로
		//삼성티비나 엘지티비 객체를 참고한다.
		//하지만 이 방법 역시 티비를 변경하고자 할때,
		//티비클래스객체를 생성하는 소스코드를 수정해야만 한다!!!!
		
		tv.turnOn(); //다형성 (samsung이 오든 엘지가 오든 !!!)
		
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
