public class April1th03 {
	public static void main(String[] args) {
         A a = new A();
		 a.sayOk();
		 a.m1();
	}
}
class A {
	//1��ͬһ�����еķ������ã�ֱ�ӵ��ü���
	public void print(int n) {
		System.out.println("print()���������� n=" + n);
	}
	public void sayOk() { //sayOk���� print (ֱ�ӵ��ü���)
		print(10);
		System.out.println("����ִ��sayOk()");
	}
	public void m1() {
		//����B����Ȼ���ٵ��÷���
		System.out.println("m1()����������");
		B b = new B();
		b.hi();
        System.out.println("m1()����ִ��");
	}
}
    //2�������еķ���A�����B�෽������Ҫͨ�����������á�
class B {
	public void hi() {
		System.out.println("B���е�hi()��ִ��");
	}
}