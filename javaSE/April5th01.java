public class April5th01 {
	public static void main(String[] args) {
           Person p = new Person();
		   p.name = "milan";
		   p.age = 100;
		   //����tools����
		   MyTools tools = new MyTools();
		   Person p2 = tools.copyPerson(p);
           //����p �� p2 ��Person���󣬵��������������Ķ���������ͬ
		   System.out.println("p������ age=" + p.age + "����=" + p.name);
           System.out.println("p2������ age=" + p2.age + "����=" + p2.name);
		   System.out.println(p2 == p);
	}
}
class Person {
	String name;
	int age;
}
class MyTools {
	//��дһ������copyPerson�����Ը���һ��Person���󣬷��ظ��ƵĶ���
	//��¡����Ҫ��õ��¶����ԭ���Ķ��������������Ķ���ֻ�����ǵ�������ͬ��
	public Person copyPerson(Person p) {
		//����һ���µĶ���
		Person p2 = new Person();
		p2.name = p.name; //��ԭ����������ָ���p2.name
		p2.age = p.age;        //��ԭ����������丳��p2.age
		return p2;
}
}
