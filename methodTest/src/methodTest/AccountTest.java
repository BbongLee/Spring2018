package methodTest;

class Account {
	private String name; // �̸�
	private int balance; // �ܾ�

	public Account(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int deposit(int won) { // �Ա�
		balance += won;
		return won;
	}

	public int withdraw(int won) {// ���
		if (balance >= won) {
			balance -= won;
			return won;
		} else {
			System.out.println("�ܾ��� �����մϴ�!!!!");
			return 0;
		}
	}

}

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------ȫ�浿�� ������------------");
		Account a = new Account("ȫ�浿", 10000);
		System.out.println(a.deposit(50000) + "���� �ԱݵǾ����ϴ�.");
		System.out.println(a.getName() + "���� �ܾ��� " + a.getBalance() + "�Դϴ�.");
		System.out.println(a.withdraw(40000) + "�� ��ݵǾ����ϴ�.");
		System.out.println(a.withdraw(10000) + "�� ��ݵǾ����ϴ�.");
		System.out.println(a.getName() + "���� �ܾ��� " + a.getBalance() + "�Դϴ�.");

		System.out.println("----------������� ������------------");
		Account b = new Account("�����", 20000);
		System.out.println(b.deposit(20000) + "���� �ԱݵǾ����ϴ�.");
		System.out.println(b.getName() + "���� �ܾ��� " + b.getBalance() + "�Դϴ�.");
	}

}
