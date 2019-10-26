package ch07;

public class Human {
	private String bloodType;
	private String name;
	private int age;
	private Human() {};
	Human(String newBloodType,String newName, int newAge){
		bloodType = newBloodType;
		name = newName;
		age = newAge;
	};
	void SetBloodType(String type) {
		bloodType = type;
	}
	String GetBloodType() {
		return bloodType;
	}
	void SetName(String newName) {
		name = newName;
	}
	String GetName() {
		return name;
	}
	void SetAge(int newAge) {
		age = newAge;
	}
	int GetAge() {
		return age;
	}
	
}
