public class February25th01 {
	public static void main(String[] args) {
		//��ʾ��ϵ�������ʹ��
		int a = 9;
		int b = 8;
		System.out.println(a > b);//T
		System.out.println(a >= b);//T
		System.out.println(a <= b);//F
		System.out.println(a < b);//F
		System.out.println(a == b);//F
		System.out.println(a != b);//T
		boolean flag = a > b;//T
		System.out.println("falg=" + flag);
	}
}