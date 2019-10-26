package ch07;

public class InheritanceExam1 {
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		sc.move();
		sc.openSunloof();
		System.out.println(sc.getDoor());
		System.out.println(sc.getTire());
		System.out.println(sc.toString());
	}
}