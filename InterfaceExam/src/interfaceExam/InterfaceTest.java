package interfaceExam;

public class InterfaceTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		Fish f1 = new Fish();
		Flyable[] flys = {p1,f1}; //p1은 Flyable타입, UPCASTING!!!
		//Flyable[] flys = new Flyable[2];
		//flys[0] = p2; flys[1] = f1;
		
		
		for(int i=0; i<flys.length; i++){
			flys[i].fly(); //다형성
		}

	}

}
