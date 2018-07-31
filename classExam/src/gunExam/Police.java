package gunExam;

public class Police {
	private int handcuffs;
	private Gun pistol; //GunŸ�� �ǽ���!!!���

	public Police(int bullet, int handcuffs){
		this.handcuffs = handcuffs;
		if(bullet>0)
			pistol = new Gun(bullet);
	}
	
	public void putHandcuff(){
		System.out.println("��Ƶ�!!");
		handcuffs--;
	}
	public void shoot(){
		if(pistol==null){
			System.out.println("���� ��� �� �� ��!");
		}else{
			pistol.shoot(); //********����***����߿�*******��Ƽ踦 ���, ����� ���� �����ְ�, ���� �Ѿ��� ���.
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
