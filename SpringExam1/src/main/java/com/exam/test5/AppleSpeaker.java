package com.exam.test5;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker(){
		System.out.println("애플스피커 객체 생성됨");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("애플스피커 볼륨 업!!");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("애플스피커 볼륨 다운!!");
	}

}
