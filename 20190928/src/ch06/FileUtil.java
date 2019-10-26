package ch06;

import java.io.*;

public class FileUtil {
	public static void main(String[] args) throws IOException {
		File file = new File("c:/으악이게뭐야");
		if (!file.exists()) {
			System.out.println("만든다");
			file.mkdir();
		}
		File file2 = new File("c:/으악이게뭐야/띠용.txt");
		if (!file2.exists()) {
			file2.createNewFile();
			System.out.println("만들어");
		}
		System.out.println(file2);
	}
}
