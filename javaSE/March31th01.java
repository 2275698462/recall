public class March31th01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.speak();//���÷���
	}
}
class Person {
	/*����
	 1��publicvia��ʾ�����ǹ�����
	 2��void��ʾ����û�з���ֵ
	 3��speak()��speak�Ƿ�������()�β��б�
	 4��{}�����壬д����Ҫִ�еĴ���
	*/
	public void speak() {
		System.out.println("����һ������");
	}
}