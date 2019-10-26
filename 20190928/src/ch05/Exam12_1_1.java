package ch05;

import java.util.Scanner;

import javax.xml.parsers.FactoryConfigurationError;

public class Exam12_1_1 {
	public static void main(String[] args) {
		/*
		 * System.out.print("아이디 입력:"); Scanner s = new Scanner(System.in); String id =
		 * s.nextLine(); System.out.println(id); boolean isUpper = false; boolean
		 * isLower = false;
		 * 
		 * for (int i = 0; i < id.length(); i++) { char c = id.charAt(i); if (c >= 65 &&
		 * c <= 90) { isUpper=true; } else if(c>=97 && c<=122) { isLower = true; } }
		 * if(isUpper && isLower) { System.out.println("가입완료"); }else {
		 * System.out.println("다시 입력"); }
		 */
		/*
		 * char asd = ' '; System.out.println((int) asd); String str =
		 * "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj."
		 * ; for (int i = 0; i < str.length(); i++) { int asdf = str.charAt(i) + 2; if
		 * (asdf >= 97 && asdf < 122 || asdf == 34)
		 * 
		 * System.out.print((char) asdf); }
		 */
//		String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
//		int idx = 0;
//		int cnt = 0;
//		while(idx>=-1) {
//			idx = str.indexOf("Lorem", idx);
//			System.out.println(idx);
//			if(idx!=-1) {
//				cnt++;
//			}
//			if(idx==-1) break;
//			idx++;
//		}
//		System.out.println(cnt);
//		String str = "JAVA 개발자 양성을 통한 취업연계과정!!";
//		int a = str.length();
//		while (a != 0) {
//			str = str.substring(0, a);
//			System.out.println(str);
//			a--;
//
//		}
//		String nowDate = "20150926";
//		StringBuffer strBuf = new StringBuffer(nowDate);
//		strBuf.insert(4, "-");
//		strBuf.insert(7, "-");
//		nowDate = strBuf.toString();
//		System.out.println(nowDate); // => [출력결과] 2015-09-26
//		String inputDate = "2015-09-26";
//		// 코드 작성
//		System.out.println(inputDate); // => [출력결과] 2015년 09월 26일

//		String file = "/home/temp/Java.class";
//		String[] arr = file.split("/");
//		for (int j = 0; j < arr.length; j++) {
//			if(arr[j].equals(""))continue;
//			else
//				System.out.print("/"+arr[j]);
//		}

		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		int idx = 0;
		while (true) {
			idx = str.indexOf(" ", idx + 1);
			if (idx == -1)
				break;
			String s = str.substring(0, idx);
			System.out.println(s);

		}
	}
}
