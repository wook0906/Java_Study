package ch07;

import java.util.ArrayList;
import java.util.List;

public class BloodHouse {
	public static void main(String[] args) {
		ArrayList<Human> waitHumanList = new ArrayList<Human>();
		waitHumanList.add(new Human("AB","김",10));
		waitHumanList.add(new Human("A","나",50));
		waitHumanList.add(new Human("B","박",30));
		waitHumanList.add(new Human("O","이",80));
		int hc = 0;
		for (Human human : waitHumanList) {
			if(human.GetName()=="박")
				hc = human.hashCode();
		}
		for (Human human : waitHumanList) {
			System.out.println(Action(human));
			if(human.hashCode() == hc) {
				System.out.println(human.GetName());
			}
		}
	}
	public static boolean IsPossible(Human human) {
		//16~70(exclusive)
		if(human.GetAge()>=16 && human.GetAge()<70)
			return true;
		return false;
	}
	public static String Action(Human human) {
		if(IsPossible(human))
			return human.GetName() + "님은 헌혈이 가능합니다";
		return human.GetName()+"님은 헌혈이 불가능합니다";
	}
}
