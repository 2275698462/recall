public class April16th02 {
	public static void main(String[] args) {
		Person p1 = new Person("abc", 11);
		Person p2 = new Person("abc", 11);
		System.out.println(p1.compareTo(p2));
	}
}
class Person {
	String name;
	int age;
	//构造器
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//compareTo比较方法
	public boolean compareTo(Person p) {
		return this.name.equals(p.name) && this.age == p.age;
	}
}