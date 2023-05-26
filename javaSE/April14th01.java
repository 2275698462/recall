public class April14th01{
	public static void main(String[] args) {
     Person p1 = new Person();
	 p1.say();
	 T t = new T();
	 t.text();//第一种跨类访问对象属性的方式
	 t.text2(p1);//第二种跨类访问对象属性的方式
	}
}
class Person {
	String name = "jack";
	public void say(){
		//1、属性和局部变量可以重名，访问时遵循就近原则
		String name = "king";
		System.out.println(name);
		//5、局部变量没有默认值
		//int i;
		//System.out.println(i);
	}
}
class T {
	//3、属性可以被本类使用，或其他类使用（通过对象调用）
	public void text() {
		Person p1 = new Person();
		System.out.println(p1.name);
	}
	public void text2 (Person p1) {
		System.out.println(p1.name);
	}
}