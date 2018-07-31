package gunExam;

public class Police {
	private int handcuffs;
	private Gun pistol; //Gun타입 피스톨!!!우왕

	public Police(int bullet, int handcuffs){
		this.handcuffs = handcuffs;
		if(bullet>0)
			pistol = new Gun(bullet);
	}
	
	public void putHandcuff(){
		System.out.println("잡아따!!");
		handcuffs--;
	}
	public void shoot(){
		if(pistol==null){
			System.out.println("총이 없어서 못 쏴 써!");
		}else{
			pistol.shoot(); //********위임***대박중요*******방아쇠를 당김, 사람이 총을 갖고있고, 총이 총알을 쏜다.
		}
	}
	
	public static void main(String[] args){
		Police p1 = new Police(3,3);
		//p1.pistol.bullet
		p1.shoot();p1.shoot();p1.shoot();
		p1.putHandcuff();p1.shoot();
		p1.shoot();
	}
	
}
