package com.exam.test4;

public class LgTV implements TV{
	public LgTV(){
		System.out.println("����Ƽ�� �Ѱ��� �����!!");
	}
	
	public void turnOn(){
		System.out.println("LG TV --- ������ ������.");
	}
	
	public void turnOff(){
		System.out.println("LG TV --- ������ ������.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("LG TV VOLUME UP!!!!");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LG TV VOLUME Down!!!!");
	}
}
