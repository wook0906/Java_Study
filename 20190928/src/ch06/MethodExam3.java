package ch06;

public class MethodExam3 {
	public static void main(String[] args) {
		int ranNum = NextInt(56);
		System.out.println(ranNum);
	}
	public static int NextInt(int bound)
	{
		double d = Math.random();
		int result = (int)(d*bound);
		return result;
	}
}
