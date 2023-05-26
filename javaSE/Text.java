public class Text {  //共有类
	int count = 9;
	public void count1() {
		count = 10;
		System.out.println("count1=" + count);
	}
	public void count2() {
		System.out.println("count1=" + count++);
	}
	//这是Text类的main方法，任何一个类，都可以有main
	public static void main(String args[]) {

		new Text().count1();
		Text t1 = new Text();
		t1.count2();
		t1.count2();
	}
}