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
	//������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//compareTo�ȽϷ���
	public boolean compareTo(Person p) {
		return this.name.equals(p.name) && this.age == p.age;
	}
}