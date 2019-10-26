package ch07;

import java.util.ArrayList;

public class AccountExamMain {
	static ArrayList<Account> accArrList;
	public static void main(String[] args) {
		accArrList = new ArrayList<Account>();
		accArrList.add(new Account("1002-03-0001000","Kim",100000));
		accArrList.add(new Account("1002-03-0001001","Na",200000));
		accArrList.add(new Account("1002-03-0001002","Park",300000));
		accArrList.add(new Account("1002-03-0001003","Lee",400000));
		PrintAccountInfoByOwnerName("Park");
	}
	public static void PrintAccountInfoByOwnerName(String ownerName) {
		for (Account acc : accArrList) {
			if(acc.GetOwner() == ownerName)
				System.out.println("["+acc.GetAccountNum()+"]"+" 예금주 : "+acc.GetOwner()+" 잔액 : "+acc.GetRemainMoney());
		}
	}
}
