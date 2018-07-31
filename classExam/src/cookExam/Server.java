package cookExam;

public class Server {
	private String name;
	private Chef chef;
	
	public Server(String name, Chef chef) {
		super();
		this.name = name;
		this.chef = chef;
	}
	
	public String serve(String foodName){
		System.out.println("종업원이 주문을 받음......");
		String food = chef.cook(foodName);
		System.out.println("주방장으로부터 종업원이  요리받음");
		return food;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Chef getChef() {
		return chef;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	
}
