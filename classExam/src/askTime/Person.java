package askTime;

public class Person {
	private Watch watch; //Person�� Watch�� �����Ѵ�.

	//�����ڸ� ���� Watch�� ����
	public Person(Watch watch) {
		this.watch = watch;
	}
	
	public Watch getWatch(){
		return watch;
	}
	//�޼��带 ���� Watch�� ����
	public void setWatch(Watch watch){
		this.watch = watch;
	}
	
	public String whatTime(){
		if(watch!=null)
			return watch.whatTime();//���� : �� �ð��� �� �� ����! �ð谡 �˾Ƽ� ���� �� �� ����!
		else 
			return "���� �ð谡 ����� �ФФ�";
	}
	
}
