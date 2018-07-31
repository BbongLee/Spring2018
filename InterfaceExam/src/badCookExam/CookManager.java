package badCookExam;

public class CookManager {
	// CookManager가 구체적인 KoreanCook을 알고있음
	// 높은 결합도!!! 낮은 응집도!!!!
	//좋은 프로그래밍은 낮은 결합도, 높은 응집도!!!!!
	private ICook cook = new KoreanCook(); //구체적으로 알고있음 -> 새로 바꿀때 유지보수 어렵다, 컴파일 다시해야된다는 건 아주아중ㅈ아주 나쁜거임.!!! 
	
	public CookManager(ICook cook){
		this.cook = cook;
	}
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
