package methodTest;

public class WatchTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		tv.powerOn();
		if (tv.power) {
			System.out.println("현재 채널은 " + tv.getChannel() + "입니다.");
			System.out.println("현재 볼륨은 " + tv.getVolume() + "입니다.");
			tv.setChannel(16);
			tv.channelUp();
			tv.volumUp();
			tv.volumUp();
			System.out.println("현재 채널은 " + tv.getChannel() + "입니다.");
			System.out.println("현재 볼륨은 " + tv.getVolume() + "입니다.");
		} else {
			System.out.println("티비 틀어야 돼요!");
		}
		tv.powerOn();
	}

}
