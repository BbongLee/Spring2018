package com.exam.test3;

public class SamsungTV implements TV{
	public SamsungTV() {

	}
	public void volumeUp() {
		System.out.println("SamsungTV VOLUME UP!!!!");
	}

	public void volumeDown() {
		System.out.println("SamsungTV VOLUME Down!!!!");
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
}
