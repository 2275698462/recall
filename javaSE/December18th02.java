public class December18th02 {
	public static void main(String[] args) {

		//2、强转符号只针对最近的操作数有效，往往使用小括号提高优先级。
		//int x = (int)10 * 3.5 + 6 * 1.5;  编译错误：double——>int
		int x = (int)(10 * 3.5 + 6 * 1.5); //44
		System.out.println(x);

		//3、char类型可以保存int的常量型，但不能保存int的变量型，需要强转。
		char c1 = 100;//ok
		int m = 100;//ok
		//char c2 = m;//错误
		char c3 = (char)m;//ok
		System.out.println(c3);//100对应的字符d
	}
}