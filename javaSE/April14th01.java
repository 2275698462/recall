public class April14th01{
	public static void main(String[] args) {
     Person p1 = new Person();
	 p1.say();
	 T t = new T();
	 t.text();//��һ�ֿ�����ʶ������Եķ�ʽ
	 t.text2(p1);//�ڶ��ֿ�����ʶ������Եķ�ʽ
	}
}
class Person {
	String name = "jack";
	public void say(){
		//1�����Ժ;ֲ�������������������ʱ��ѭ�ͽ�ԭ��
		String name = "king";
		System.out.println(name);
		//5���ֲ�����û��Ĭ��ֵ
		//int i;
		//System.out.println(i);
	}
}
class T {
	//3�����Կ��Ա�����ʹ�ã���������ʹ�ã�ͨ��������ã�
	public void text() {
		Person p1 = new Person();
		System.out.println(p1.name);
	}
	public void text2 (Person p1) {
		System.out.println(p1.name);
	}
}