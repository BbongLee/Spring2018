package askTime;

public class Person {
	private Watch watch; //Person은 Watch에 의존한다.

	//생성자를 통해 Watch를 주입
	public Person(Watch watch) {
		this.watch = watch;
	}
	
	public Watch getWatch(){
		return watch;
	}
	//메서드를 통해 Watch를 주입
	public void setWatch(Watch watch){
		this.watch = watch;
	}
	
	public String whatTime(){
		if(watch!=null)
			return watch.whatTime();//위임 : 난 시간을 알 수 없지! 시계가 알아서 내가 알 수 있지!
		else 
			return "저는 시계가 없어요 ㅠㅠㅠ";
	}
	
}
