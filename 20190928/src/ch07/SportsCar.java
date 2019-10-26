package ch07;

public class SportsCar extends Car {
	char color = 'R';

	SportsCar() {
		System.out.println("SportsCar 객체 생성");
	}

	void openSunloof() {
		System.out.println("썬루프 열림");
	}
}
