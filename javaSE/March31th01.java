public class March31th01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.speak();//调用方法
	}
}
class Person {
	/*方法
	 1、publicvia表示方法是公开的
	 2、void表示方法没有返回值
	 3、speak()，speak是方法名，()形参列表
	 4、{}方法体，写我们要执行的代码
	*/
	public void speak() {
		System.out.println("我是一个好人");
	}
}