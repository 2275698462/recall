public class March22th03 {
	public static void main(String[] args) {
		char c[] = new char[26];
		for(int i = 0; i < c.length; i++) {
			//c��char[]����
			//c[i]char����
		   c[i] = (char)('A' + i);   //��ֵ��'A' + i ��int����Ҫǿת
		}
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
