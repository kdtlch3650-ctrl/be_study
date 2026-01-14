package be_study.quiz.quiz30;

public class AccountA {

	private String owner;
	private long balance;
//	private long balance;
	AccountA() {

	}
	AccountA(String owner) {
		this.owner = owner;
	}
	AccountA(long balance) {
		this.balance = balance;
	}
	
	AccountA(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public static void main(String[] args) {
		AccountA atm = new AccountA(10000);
		System.out.println("현재잔액: "+atm.withdraw(9000)+"\n=======");
		System.out.println("현재잔액: "+atm.deposit(100)+"\n=======");
		System.out.println("현재잔액: "+atm.withdraw(2000)+"\n=======");
	}
	
	public long deposit(long amount) {
		this.balance += amount;
		System.out.printf("입금금액:%d\n",amount);
		return this.balance;
	}
	
//	public long withdraw(long amount) {
//		this.balance -= amount;
//		return this.balance;
//	}
	
	public long withdraw(long amount) {
		if(this.balance>=amount) {
		this.balance -= amount;
		
		}else{System.out.printf("잔액이 부족합니다. 출금금액:%d\n",amount);}
		return this.balance;
	}
	
	

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

}
