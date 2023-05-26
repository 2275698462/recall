public class February25th01 {
	public static void main(String[] args) {
		//演示关系运算符的使用
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