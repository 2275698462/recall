public class April10th01 {
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1,1.111));
	}
}
class MyCalculator {
	//������ĸ�calculate��������������
	//���������ĺ�
	public int calculate(int n1, int n2) {
		return n1 + n2;
	}
	//һ��������һ��double�ĺ�
	public double calculate(int n1, double n2) {
		return n1 + n2;
	}
	//һ��double��һ�������ĺ�
	public double calculate(double n1 , int n2) {
		return n1 + n2;
	}
	//����int�ĺ�
	public int calculate(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
}