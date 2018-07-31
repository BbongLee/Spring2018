package com.exam.test4;

public class SamsungTV implements TV{
	public SamsungTV() {
		System.out.println("삼성티비 한개가 실행됨!!");
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
		System.out.println("SamsungTV VOLUME UP!!!!");
	}
	public void volumeDown() {
		System.out.println("SamsungTV VOLUME Down!!!!");
	}
}
