package ch05;

import java.util.Arrays;
import java.util.Random;

public class bingo {
	public static void main(String[] args) {
		int bingoRow = 5;
		int[] bingo = new int[bingoRow * bingoRow];
		for (int i = 0; i < bingoRow * bingoRow; i++) {
			bingo[i] = i + 1;
		}
		System.out.println(Arrays.toString(bingo));
		for (int i = 0; i < bingoRow * bingoRow; i++) {
			Random r = new Random();
			int num = r.nextInt(bingoRow * bingoRow);
			int tmp = bingo[num % bingoRow * bingoRow];
			bingo[num % bingoRow * bingoRow] = bingo[num];
			bingo[num] = tmp;
		}
		for (int i = 1; i <= bingoRow * bingoRow; i++) {
			System.out.print(bingo[i-1]+" ");
			if(i%5 == 0){
				System.out.println();
			}
		}

	}
}
