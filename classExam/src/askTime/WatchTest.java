package askTime;

public class WatchTest {

	public static void main(String[] args) {
		Person p = new Person(null);
		System.out.println(p.whatTime());
		//setter�� ���ؼ� watch�� ����
		p.setWatch(new Watch());
		System.out.println(p.whatTime());
		
		Watch watch = new Watch();
		//�����ڸ� ���ؼ� watch�� ����
		Person p1 = new Person(watch);
		System.out.println(p1.whatTime());
	}

}
