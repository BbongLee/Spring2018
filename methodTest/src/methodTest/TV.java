package methodTest;

public class TV {
	private int channel;
	private int volume;
	boolean power;
	
	public TV(){
		channel = 9;
		volume = 20;
		power = false;
	}
	
	
	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void powerOn(){
		if(power){
			power = false;
			System.out.println("TV가 꺼졌습니다.");
		}else{
			power = true;
			System.out.println("TV가 켜졌습니다.");
		}
	}
	
	public void setChannel(int num){
		this.channel = num;
	}
	public int getChannel(){
		return channel;
	}
	public void channelUp(){
		channel += 1;
	}

	
	public int getVolume(){
		return volume;
	}
	
	public void volumUp(){
		volume += 1;
	}
	
	
}
