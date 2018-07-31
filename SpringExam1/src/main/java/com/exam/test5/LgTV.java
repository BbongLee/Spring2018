package com.exam.test5;

public class LgTV implements TV{
	//LgTV는 스피커에 의존
	private Speaker speaker;
	//생성자를 통한 스피커 주입
	public LgTV(Speaker speaker){
		this.speaker = speaker;
	}
	public LgTV(){
		System.out.println("엘지티비 한개가 실행됨!!");
	}
	//세터를 ㅌ통한 스피커 주입
	public void setSpeaker(Speaker speaker){
		this.speaker = speaker;
	}
	public void turnOn(){
		System.out.println("LG TV --- 전원이 켜진다.");
	}
	
	public void turnOff(){
		System.out.println("LG TV --- 전원이 꺼진다.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
//		System.out.println("LG TV VOLUME UP!!!!");
		speaker.volumeUp(); //스피커에게 위임
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
//		System.out.println("LG TV VOLUME Down!!!!");
		speaker.volumeDown(); //스피커에게 위임
	}
}
