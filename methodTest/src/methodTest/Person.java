package methodTest;

public class Person {
	private int age; //메소드를 통해!!!!!!!데이터 변경하도록!!!!!!!!!!!
	private String name;
	private double weight;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		if(age<0||age>150)
		{
			System.out.println("나이 오류"); 
			return;
		}
		this.age = age;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}
