public class March22th03 {
	public static void main(String[] args) {
		char c[] = new char[26];
		for(int i = 0; i < c.length; i++) {
			//c是char[]类型
			//c[i]char类型
		   c[i] = (char)('A' + i);   //赋值，'A' + i 是int，需要强转
		}
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
