package goodCookExam;
//CookManager는 구체적인 코리안쿡이나 차이니즈쿡을 모름
//쿡메니저는 추상적인 ICook에 의존함
//낮은 결합도 => 유지보수 잘됨!!!
public class CookManager {
	private ICook cook; //쿡매니저는 아이쿡에 의존, 의존관계 (구체적인 클래스에 의존하지말고 인터페이스에 의존하자!!!)
	//생성자를 이용한 ICook 주입
	public CookManager(ICook cook){
		this.cook = cook;
	}

	//setter를 이용한 ICook 주입
	public void setCook(ICook cook) {
		this.cook = cook;
	}
	
	public void orderRice(){
		cook.makeRice(); //위임, 다형성 (코리안 쿡인지 차이니즈쿡인지 알면 안됨!!!여기서!!!!!)
	}
	
	public void orderSoup(){
		cook.makeSoup();
	}
	public void orderSalad(){
		cook.makeSalad();
	}
	public void orderSource(){
		cook.makeSource();
	}
}
