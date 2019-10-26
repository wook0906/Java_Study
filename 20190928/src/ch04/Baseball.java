package ch04;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Number n = new Number();
		int number = n.get();
		
		int baseball3 = number % 10;
		int baseball2 = (number / 10) % 10;
		int baseball1 = (number / 10 / 10) % 10;

		Scanner s = new Scanner(System.in);
		int inputNumber1 = s.nextInt();
		int inputNumber2 = s.nextInt();
		int inputNumber3 = s.nextInt();
		
		int strike = 0; // 스트라이크를 개수를 저장할 변수
		int ball = 0; // 볼의 개수를 저장할 변수
		
		if(inputNumber1 == baseball1) {
			strike++;
		}
		else if(inputNumber1 == baseball2 || inputNumber1 == baseball3) {
			ball++;
		}
		
		if(inputNumber2 == baseball2) {
			strike++;
		}
		else if(inputNumber2 == baseball1 || inputNumber2 == baseball3) {
			ball++;
		}

		
		if(inputNumber3 == baseball3) {
			strike++;
		}
		else if(inputNumber2 == baseball1 || inputNumber2 == baseball2) {
			ball++;
		}
		
		System.out.println("스트라이크 => " + strike);
		System.out.println("볼 => " + ball);
	}
}

class Number {
	public int get() {
		int number = 0;
		try {
			URL url = new URL("http://ggoreb.com/busanit/baseball.txt");
			URLConnection urlConnection = url.openConnection();
			InputStream in = urlConnection.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			StringBuffer response = new StringBuffer();
			String data = null;
			while ((data = reader.readLine()) != null) {
				response.append(data);
			}
			number = Integer.parseInt(response.toString());
			reader.close();
			isr.close();
			in.close();
		} catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
		return number;
	}
}