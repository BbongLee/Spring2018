package com.exam.test1;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삼성과 엘지는 메소드 시그니쳐가 다르므로
		//티비유저 코드 대부분을 수정해야 티비를 교체핤 ㅜ  있다.
		//현재상태에서는 두 티비클래스가 같은 메소드를 가지게끔
		//강제할 어떠한 수단도 없다. 만약 티비유저와 같은 클라이언트 프러그래ㅁㅁ이 하나가아니라 
		//여러개라면 유지보수는 더 힘ㄷ르것!!
		//티비교체도 넘 힘들것!!!
		
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
