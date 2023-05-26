public class April15th02 {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.age);
		Person p1 = new Person("aaa", 10);
		System.out.println(p1.age + p1.name);
	}
}
class Person {
	int age;
	String name;
	public Person() {
		age = 18;
	}
	public Person(String pName, int Page) {
		name = pName;
		age = Page;
	}
}