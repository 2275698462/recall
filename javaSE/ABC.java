public class ABC
{
	public static void main( String[] args) {

		//变量i的作用域是main方法
		//在整个main方法中是有效的，可见的，可以访问的
		int i = 100;
	}
	public static void doSome() {

		//这里无法访问main方法当中的变量i
		//已经出了i变量的作用域
		System.out.println(i);
	}
}