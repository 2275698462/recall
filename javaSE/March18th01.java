public class March18th01 {
	public static void main(String[] args) {
		for(int i= 1; i <= 10; i++) {
			//Math.random()  �������һ��(0,1)��double
			System.out.println((int)(Math.random() * 100) + 1);
		}
	}
}