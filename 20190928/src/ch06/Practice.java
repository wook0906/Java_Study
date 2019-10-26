package ch06;

import java.util.Calendar;

public class Practice {
	public static void main(String[] args) {
		CheckGrade(8);
		GetBetweenSum(5, 3);
		GetLastYear(10);
		Dilemma(true, false);
		Calendar cal = Calendar.getInstance();
		int year = cal.get(cal.YEAR);
		int month = cal.get(cal.MONTH);  // 1월이 0임
		int day = cal.get(cal.DAY_OF_WEEK); //토요일이 7임.
		System.out.println(year);
		System.out.println(month); 
		System.out.println(day);
	}

	public static void CheckGrade(int weight) {
		if (weight >= 10) {
			System.out.println(1);
		} else if (weight < 10 && weight >= 7) {
			System.out.println(2);
		} else if (weight < 7 && weight >= 4) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}

	public static void GetBetweenSum(int num1, int num2) {
		int sum = 0;
		if (num1 == num2) {
			System.out.println(num1);
			return;
		}
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				sum += i;
			}
		} else {
			for (int i = num2; i <= num1; i++) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static void GetLastYear(int month) {
		switch (month) {
		case 1:
			System.out.println(31);
			break;
		case 2:
			System.out.println(28);
			break;
		case 3:
			System.out.println(31);
			break;
		case 4:
			System.out.println(30);
			break;
		case 5:
			System.out.println(31);
			break;
		case 6:
			System.out.println(30);
			break;
		case 7:
			System.out.println(31);
			break;
		case 8:
			System.out.println(31);
			break;
		case 9:
			System.out.println(30);
			break;
		case 10:
			System.out.println(31);
			break;
		case 11:
			System.out.println(30);
			break;
		case 12:
			System.out.println(31);
			break;
		default:
			System.out.println("GetLastYear err");
			return;
		}
	}

	public static void Dilemma(boolean a, boolean b) {
		if (a && b)
			System.out.println("A,B둘다 5년 복역");
		else if (a && !b)
			System.out.println("A석방, B 10년 복역");
		else if (!a && b)
			System.out.println("B석방, A 10년 복역");
		else if (!a && !b)
			System.out.println("A, B 1년 복역");
	}
}
