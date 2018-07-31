package methodTest;

class Account {
	private String name; // 이름
	private int balance; // 잔액

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

	public int deposit(int won) { // 입금
		balance += won;
		return won;
	}

	public int withdraw(int won) {// 출금
		if (balance >= won) {
			balance -= won;
			return won;
		} else {
			System.out.println("잔액이 부족합니다!!!!");
			return 0;
		}
	}

}

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------홍길동의 계좌임------------");
		Account a = new Account("홍길동", 10000);
		System.out.println(a.deposit(50000) + "원이 입금되었습니다.");
		System.out.println(a.getName() + "님의 잔액은 " + a.getBalance() + "입니다.");
		System.out.println(a.withdraw(40000) + "이 출금되었습니다.");
		System.out.println(a.withdraw(10000) + "이 출금되었습니다.");
		System.out.println(a.getName() + "님의 잔액은 " + a.getBalance() + "입니다.");

		System.out.println("----------사오정의 계좌임------------");
		Account b = new Account("사오정", 20000);
		System.out.println(b.deposit(20000) + "원이 입금되었습니다.");
		System.out.println(b.getName() + "님의 잔액은 " + b.getBalance() + "입니다.");
	}

}
