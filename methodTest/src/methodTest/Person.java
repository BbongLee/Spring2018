package methodTest;

public class Person {
	private int age; //�޼ҵ带 ����!!!!!!!������ �����ϵ���!!!!!!!!!!!
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
			System.out.println("���� ����"); 
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
