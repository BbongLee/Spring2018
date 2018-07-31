package gunExam2;

public class Police {
	private int handcuffs;
	private Gun pistol; //GunŸ�� �ǽ���!!!���

	public Police(int handcuffs){
		this.handcuffs = handcuffs;
	}
	
	public void putHandcuff(){
		System.out.println("��Ƶ�!!");
		setHandcuffs(getHandcuffs() - 1);
	}
	public void shoot(Gun pistol){//����, �Ť���������!
		if(pistol==null){
			System.out.println("���� ��� �� �� ��!");
		}else{
			pistol.shoot(); //********����***����߿�*******��Ƽ踦 ���, ����� ���� �����ְ�, ���� �Ѿ��� ���.
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
