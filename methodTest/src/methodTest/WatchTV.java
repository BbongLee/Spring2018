package methodTest;

public class WatchTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		tv.powerOn();
		if (tv.power) {
			System.out.println("���� ä���� " + tv.getChannel() + "�Դϴ�.");
			System.out.println("���� ������ " + tv.getVolume() + "�Դϴ�.");
			tv.setChannel(16);
			tv.channelUp();
			tv.volumUp();
			tv.volumUp();
			System.out.println("���� ä���� " + tv.getChannel() + "�Դϴ�.");
			System.out.println("���� ������ " + tv.getVolume() + "�Դϴ�.");
		} else {
			System.out.println("Ƽ�� Ʋ��� �ſ�!");
		}
		tv.powerOn();
	}

}
