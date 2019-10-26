package ch06;

import java.util.Random;

public class MethoidExam1 {
	static int bound = 15;

	public static void main(String[] args) {

		Random ran = new Random();
		int ranNum = ran.nextInt(bound);
		PrintChar(ranNum, '@');
		String str = GetString(10,'c');
		System.out.println(str);
	}

	public static void PrintChar(int range, char ch) {
		for (int i = 0; i < range; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

	public static String GetString(int range, char ch) {
		String result = "";
		for (int i = 0; i < range; i++) {
			for (int j = 0; j <= i; j++) {
				result += ch;
			}
			result+='\n';
		}
		return result;
	}
}
