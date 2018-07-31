package company;

public class Company {
	private Employee[] employees;
	private int cnt;
	public Company(){
		employees = new Employee[4];
		employees[0] = new Manager("�̿���", "111", "�ѹ���");
		employees[1] = new Manager("�浿��", "112", "�����");
		employees[2] = new Employee("���Ȱ�", "332");
		employees[3] = new Employee("��ذ�", "453");
		cnt=4;
	}
	
	public void recruit(Employee employee){ 
		employees[cnt++] = employee;
	}
	public void makeMoney(){
		for(int i=0; i<cnt; i++){
			employees[i].work();//������
		}
	}
	public static void main(String[] args){
		Company com = new Company();
		com.makeMoney();
		
		com.recruit(new Employee("������", "555"));
		com.recruit(new Manager("������", "563", "��ȭ��")); 
		com.makeMoney();
	}
}
