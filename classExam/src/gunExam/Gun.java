package gunExam;

public class Gun {
	private int bullet;

	public Gun(int bullet){
		this.bullet = bullet;
	}
	
	public void shoot(){
		if(bullet>0){
		System.out.println("BBANG~~~!!!");
		bullet--;
		}else System.out.println("�Ѿ� ����@@@@@");
	}

	public int getBullet() {
		return bullet;
	}

	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	

}
