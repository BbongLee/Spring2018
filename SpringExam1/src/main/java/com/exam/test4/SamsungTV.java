package com.exam.test4;

public class SamsungTV implements TV{
	public SamsungTV() {
		System.out.println("�ＺƼ�� �Ѱ��� �����!!");
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV--- ������ ������.");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV --- ������ ������.");
	}
	public void volumeUp() {
		System.out.println("SamsungTV VOLUME UP!!!!");
	}
	public void volumeDown() {
		System.out.println("SamsungTV VOLUME Down!!!!");
	}
}
