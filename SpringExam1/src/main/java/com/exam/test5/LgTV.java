package com.exam.test5;

public class LgTV implements TV{
	//LgTV�� ����Ŀ�� ����
	private Speaker speaker;
	//�����ڸ� ���� ����Ŀ ����
	public LgTV(Speaker speaker){
		this.speaker = speaker;
	}
	public LgTV(){
		System.out.println("����Ƽ�� �Ѱ��� �����!!");
	}
	//���͸� ������ ����Ŀ ����
	public void setSpeaker(Speaker speaker){
		this.speaker = speaker;
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
//		System.out.println("LG TV VOLUME UP!!!!");
		speaker.volumeUp(); //����Ŀ���� ����
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
//		System.out.println("LG TV VOLUME Down!!!!");
		speaker.volumeDown(); //����Ŀ���� ����
	}
}
