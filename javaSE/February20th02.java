public class February20th02 {
	public static void main(String[] args) {
		  //a % b = a - a / b *b
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);  //-1
		System.out.println(-10 % -3);// -1
		//��a��С��ʱ��a % b = a - (int)a / b * b
		System.out.println(-10.5 % 3); //-10.5 - (-10) / 3 * 3
		//ע�⣺��С�����㣬�õ�����ǽ���ֵ
		System.out.println(-10.4 % 3);//�õ�-1.4�Ľ���ֵ
	}
}