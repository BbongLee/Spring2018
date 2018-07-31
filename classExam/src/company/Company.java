package company;

public class Company {
	private Employee[] employees;
	private int cnt;
	public Company(){
		employees = new Employee[4];
		employees[0] = new Manager("이예본", "111", "총무부");
		employees[1] = new Manager("길동고", "112", "자재부");
		employees[2] = new Employee("저팔계", "332");
		employees[3] = new Employee("방붕공", "453");
		cnt=4;
	}
	
	public void recruit(Employee employee){ 
		employees[cnt++] = employee;
	}
	public void makeMoney(){
		for(int i=0; i<cnt; i++){
			employees[i].work();//다형성
		}
	}
	public static void main(String[] args){
		Company com = new Company();
		com.makeMoney();
		
		com.recruit(new Employee("구지원", "555"));
		com.recruit(new Manager("강혜수", "563", "미화부")); 
		com.makeMoney();
	}
}
