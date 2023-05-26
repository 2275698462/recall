public class February20th02 {
	public static void main(String[] args) {
		  //a % b = a - a / b *b
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);  //-1
		System.out.println(-10 % -3);// -1
		//当a是小数时，a % b = a - (int)a / b * b
		System.out.println(-10.5 % 3); //-10.5 - (-10) / 3 * 3
		//注意：有小数运算，得到结果是近似值
		System.out.println(-10.4 % 3);//得到-1.4的近似值
	}
}