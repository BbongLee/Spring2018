package com.exam.test2;

public class LgTV implements TV{
	public LgTV(){
		
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
		System.out.println("LG TV VOLUME UP!!!!");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LG TV VOLUME Down!!!!");
	}
}
