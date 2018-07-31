package com.exam.test1;

public class SamsungTV {
	public SamsungTV() {

	}

	public void powerOn() { //시그니쳐 
		System.out.println("SamsungTV--- 전원이 켜진다.");
	}

	public void powerOff() {
		System.out.println("SamsungTV --- 전원이 꺼진다.");
	}

	public void volumeUp() {
		System.out.println("SamsungTV VOLUME UP!!!!");
	}

	public void volumeDown() {
		System.out.println("SamsungTV VOLUME Down!!!!");
	}
}
