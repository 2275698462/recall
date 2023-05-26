public class April3th02 {
	public static void main(String[] args) {
		//²âÊÔ
		B b = new B();
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		b.test200(p);
		System.out.println("mainµÄp.age = " + p.age );
	}
}
class Person {
	String name;
	int age;
}
class B {
	public void test200(Person p) {
		 p.age = 10000;
	}
}