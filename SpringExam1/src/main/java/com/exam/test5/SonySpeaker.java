package com.exam.test5;

public class SonySpeaker implements Speaker {
	public SonySpeaker(){
		System.out.println("소니스피커 객체 생성!!");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("소니 스피커 볼륨 업!!!");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("소니 스피커 볼륨 다운!!!");
	}

}
