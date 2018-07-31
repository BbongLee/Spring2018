package gunExam2;

public class Police {
	private int handcuffs;
	private Gun pistol; //Gun타입 피스톨!!!우왕

	public Police(int handcuffs){
		this.handcuffs = handcuffs;
	}
	
	public void putHandcuff(){
		System.out.println("잡아따!!");
		setHandcuffs(getHandcuffs() - 1);
	}
	public void shoot(Gun pistol){//위임, 매ㅐ개변수로!
		if(pistol==null){
			System.out.println("총이 없어서 못 쏴 써!");
		}else{
			pistol.shoot(); //********위임***대박중요*******방아쇠를 당김, 사람이 총을 갖고있고, 총이 총알을 쏜다.
		}
	}
	
	public static void main(String[] args){
		Police p1 = new Police(3);
		Gun pistol = new Gun(5);
		//p1.pistol.bullet
		p1.shoot(pistol);
		p1.putHandcuff();
		
		Police p2 = new Police(3);
		Gun pistol1 = null;
		//p1.pistol.bullet
		p2.shoot(pistol1);
		p2.putHandcuff();
	}

	public int getHandcuffs() {
		return handcuffs;
	}

	public void setHandcuffs(int handcuffs) {
		this.handcuffs = handcuffs;
	}
	
}
