package cookExam;

public class Customer {
	private String name;

	public Customer(String name) {
		super();
		this.name = name;
	}
	
	public String order(Server server, String foodName){
		System.out.println("손님이 요리를 종업원에게 주문함!!!");
		String food = server.serve(foodName);
		System.out.println("손님이 종업원으로부터 요리를 받음");
		return food;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Chef chef = new Chef("왕주방");
		Server server = new Server("최종업",chef);
		Customer customer = new Customer("김고객");
		String food = customer.order(server, "녹차 아이스라떼");
		System.out.println(customer.getName()+"이 맛있게 먹어따");
	}
}
