public class April16th01{
	public static void main(String[] args) {
         T t1 = new T();
		 //t1.f2();
		 t1.f3();
	}
}
class T {
	String name = "vvv";
	//4、访问构造器的语法：this(参数列表),
	//注意只能在构造器中使用(即只能在构造器中访问另一个构造器)
	//注意:访问构造器语法:this(参数列表);必须放置第一条语句
	public T(){
	     this("jack", 100);
		System.out.println("T()构造器");
		//这里去访问T(String name, int age)构造器
	}
	public T(String name, int age) {
		System.out.println("T(String name, int age)构造器");
	}


	//3、访问成员方法的语法：this.方法名(参数列表)
	public void f1() {
		System.out.println("f1()方法");
	}
	public void f2() {
		System.out.println("f2()方法");
		//调用本类的f1
		//第一种方法
			f1();
		//第二种方法
			this.f1();
	}
	public void f3() {
		String name = "aaa";
		//传统方法
		System.out.println(name); //就近原则
		//1、this可以用来访问本类的属性
		System.out.println(this.name);
	}
}