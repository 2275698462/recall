public class April14th02 {
	public static void main(String[] args) {
		Person p1 = new Person("aaa", 80);
		System.out.println(p1.name);
	}
}
class Person {
	String name;
	int age;
	//1��������û�з���ֵ��Ҳ����дvoid
	//2�������������ƺ�����һ��
	//3���������β��б����ͳ�Ա����һ��
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}