package interfaceExam;

public class Person implements Flyable, Singable{ //has a 관계!!!!!!!!!!! be able to !!!!
	//인터페이스 : 경계면, 접촉면

	public void sing() {
		System.out.println("랄ㄹ랄라~~~ 노래 부르자~~~");
	}

	public void fly() {
		System.out.println("우린 비행기로 하늘을 날 수도 있어!");
	}

	public void walk(){
		System.out.println("뚜벅 뚜벅 걸어가요.");
	}
}
