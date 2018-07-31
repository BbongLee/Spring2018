package company;

public class Manager extends Employee{
	private String dept;
	
	public Manager(String name, String idnum, String dept) {
		super(name, idnum);
		this.dept = dept;
	}
	public void work(){
		System.out.println("매니저 "+name+"은 "+dept+"에서 부하직원들과 열심히 일해요.");
	}

	
	
}
