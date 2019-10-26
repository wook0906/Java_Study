package ch07;

public class Account {
	private String accountNum;
	private String owner;
	private int remainMoney;

	private Account() {};
	public Account(String newAccNum,String ownerName,int firstMoney) {
		accountNum = newAccNum;
		owner = ownerName;
		remainMoney = firstMoney;
	}
	public String GetAccountNum() {
		return accountNum;
	}

	public String GetOwner() {
		return owner;
	}

	public int GetRemainMoney() {
		return remainMoney;
	}

	public void SetAccountNum(String newAccNum) {
		accountNum = newAccNum;
	}

	public void SetOwner(String newOwner) {
		owner = newOwner;
	}

	public void AddMoney(int insertMoney) {
		remainMoney += insertMoney;
	}
}
