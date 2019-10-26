package string;

public class Test {
	public static void main(String[] args) {
		String s = "abc";
//		for (int i = 0; i < 50000; i++) {
//			s = s + i;
//		}
		long startTime = 0L;
		long endTime = 0L;
		startTime = System.currentTimeMillis();
		StringBuffer strBuf = new StringBuffer();
		for (int i = 0; i < 5000000; i++) {
			strBuf.append(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println((double)(endTime-startTime/1000));
	}
}
