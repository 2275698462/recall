public class April14th02 {
	public static void main(String[] args) {
		Person p1 = new Person("aaa", 80);
		System.out.println(p1.name);
	}
}
class Person {
	String name;
	int age;
	//1、构造器没有返回值，也不能写void
	//2、构造器的名称和类名一样
	//3、构造器形参列表规则和成员方法一样
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}