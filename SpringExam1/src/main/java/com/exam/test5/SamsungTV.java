package com.exam.test5;

public class SamsungTV implements TV {
	private Speaker speaker;

	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}

	public SamsungTV() {
		System.out.println("삼성티비 한개가 실행됨!!");
	}

	// 세터를 ㅌ통한 스피커 주입
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV--- 전원이 켜진다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV --- 전원이 꺼진다.");
	}

	public void volumeUp() {
		// System.out.println("SamsungTV VOLUME UP!!!!");
		speaker.volumeUp(); // 스피커에게 위임

	}

	public void volumeDown() {
		// System.out.println("SamsungTV VOLUME Down!!!!");
		speaker.volumeDown(); // 스피커에게 위임
	}
}
