package com.exam.test5;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker(){
		System.out.println("���ý���Ŀ ��ü ������");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("���ý���Ŀ ���� ��!!");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("���ý���Ŀ ���� �ٿ�!!");
	}

}
