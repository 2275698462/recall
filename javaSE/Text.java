public class Text {  //������
	int count = 9;
	public void count1() {
		count = 10;
		System.out.println("count1=" + count);
	}
	public void count2() {
		System.out.println("count1=" + count++);
	}
	//����Text���main�������κ�һ���࣬��������main
	public static void main(String args[]) {

		new Text().count1();
		Text t1 = new Text();
		t1.count2();
		t1.count2();
	}
}