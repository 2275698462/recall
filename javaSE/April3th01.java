public class April3th01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		QQ qq = new QQ();
		qq.swap(a , b);
		System.out.println("a = " + a + ",b = " + b); //a = 10 ,b = 20
	}
}
class QQ {
	public void swap(int a, int b) {
		System.out.println("a = " + a + ",b = " + b); // a = 10, b = 20
		//完成a和b的交换
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a + ",b = " + b); //a = 20, b = 10
	}
}