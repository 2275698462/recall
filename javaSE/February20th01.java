public class February20th01 {
	public static void main(String[] args) {
		System.out.println(10 / 4);  //运算精度最大是int，结果是2
		System.out.println(10.0 / 4); //2.5

		double d = 10 / 4; //先得到2，再转为double
		System.out.println(d); //2.0
	}
}