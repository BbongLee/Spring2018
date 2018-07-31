package com.exam.test5;

public class SamsungTV implements TV {
	private Speaker speaker;

	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}

	public SamsungTV() {
		System.out.println("�ＺƼ�� �Ѱ��� �����!!");
	}

	// ���͸� ������ ����Ŀ ����
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
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
		// System.out.println("SamsungTV VOLUME UP!!!!");
		speaker.volumeUp(); // ����Ŀ���� ����

	}

	public void volumeDown() {
		// System.out.println("SamsungTV VOLUME Down!!!!");
		speaker.volumeDown(); // ����Ŀ���� ����
	}
}
