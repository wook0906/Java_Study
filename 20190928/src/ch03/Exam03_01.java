package ch03;

import java.util.Random;
import java.util.Scanner;
import java.sql.Time;
import java.util.*;

public class Exam03_01 {
	public static void main(String[] args) {
		/*
		 * boolean result = 1+2/2>=1+1*2; System.out.println(result);
		 */
		/*
		 * int div = 5/2; System.out.println(div);
		 */
		/*
		 * int num = 23; int num2 = 5; System.out.println(num/num2);
		 * System.out.println(num%num2);
		 */

		/*
		 * int num = 456; System.out.println((num/100)*100);
		 * System.out.println(num-(num%100));
		 */
		/*
		 * Scanner scan = new Scanner(System.in); int num = scan.nextInt(); int ten =
		 * num/10; int one = num%10; boolean isMatch = false; isMatch = ten == one;
		 * System.out.println(isMatch);
		 */
		/*
		 * int num = 12345; int num1 = num % 10; num/=10; int num2 = num % 10; num/=10;
		 * int num3 = num % 10; num/=10; int num4 = num % 10; num/=10; int num5 = num %
		 * 10; int total = num1 + num2 + num3 + num4 + num5; System.out.println(total);
		 */
		/*
		 * int com; int player; System.out.println("가위 = 0, 바위 = 1, 보 = 2"); do {
		 * Scanner scan = new Scanner(System.in); player = scan.nextInt();
		 * }while(player>3 && player<=0); Random ran = new Random(); com =
		 * ran.nextInt(3); System.out.println("컴퓨터 : "+ com); if((player+1)%3==com) {
		 * System.out.println("짐"); }else if(player==com) { System.out.println("비김");
		 * }else { System.out.println("이김"); }
		 */
		/*
		 * Scanner scan = new Scanner(System.in); Random r = new Random(); int score =
		 * r.nextInt(101); System.out.println(score); // \ △ △ / if (score % 3 == 0 &&
		 * score % 2 == 0) {// \(^∇^)/ System.out.println("짝"); // ~~ | | } else if
		 * (score % 3 == 0) { // └┬─┬┘ System.out.println("짝"); // / / } else if (score
		 * % 2 == 0) { // System.out.println("쿵짝"); }
		 */
		/*
		 * int sum = 0; for(int i=0;i<100;i++) { sum+=i; } System.out.println(sum);
		 * 
		 * int sum2 = 0; for(int i=0;i<=1000;i++) { if(i%2==0 && i%7==0) { sum2+=i;
		 * System.out.println(sum2); } }
		 */
		int num = 12345;
		int sum = 0;
		while(num>0) {
			int num1 = num%10;
			num/=10;
			sum+=num1;
		}
		System.out.println(sum);
		
	}
}
