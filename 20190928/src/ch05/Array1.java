package ch05;

import java.util.Random;

public class Array1 {
	public static void main(String[] args) {
		char[] chars = {'a','b','c','d','e','f','g'};
		for(int i = 0;i<chars.length;i++) {
			System.out.print(chars[i]);
		}
		System.out.println();
		Random ran = new Random();
		for(int i = 0;i<chars.length;i++) {
			ran = new Random();
			int ranNum = ran.nextInt(chars.length);
			char tmp = chars[i];
			chars[i] = chars[ranNum];
			chars[ranNum] = tmp;
		}
		for(int i = 0;i<chars.length;i++) {
			System.out.print(chars[i]);
		}
	}
}
