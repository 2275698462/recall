public class April9th01 {
	public static void main(String[] args) {
		//�ݹ�
    T t1 = new T();
	int n = 5;
	System.out.println("��n=" + n + "��Ӧ��쳲�������=" + t1.fibonacci(n));
	System.out.println(t1.peach(1));
	}
}
class T {
	public int fibonacci(int n) {
		if( n == 1 || n == 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	public int peach(int day) {
		if( day == 10) {
			return 1;
		} else{
			return (peach(day + 1) + 1) * 2;
	}
	}
}