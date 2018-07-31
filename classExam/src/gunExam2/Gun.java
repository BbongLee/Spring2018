package gunExam2;

public class Gun {
	private int bullet;

	public Gun(int bullet){
		this.bullet = bullet;
	}
	
	public void shoot(){
		if(bullet>0){
		System.out.println("BBANG~~~!!!");
		bullet--;
		}else System.out.println("ÃÑ¾Ë ¾ø¿ò@@@@@");
	}

	public int getBullet() {
		return bullet;
	}

	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	

}
