public class April16th01{
	public static void main(String[] args) {
         T t1 = new T();
		 //t1.f2();
		 t1.f3();
	}
}
class T {
	String name = "vvv";
	//4�����ʹ��������﷨��this(�����б�),
	//ע��ֻ���ڹ�������ʹ��(��ֻ���ڹ������з�����һ��������)
	//ע��:���ʹ������﷨:this(�����б�);������õ�һ�����
	public T(){
	     this("jack", 100);
		System.out.println("T()������");
		//����ȥ����T(String name, int age)������
	}
	public T(String name, int age) {
		System.out.println("T(String name, int age)������");
	}


	//3�����ʳ�Ա�������﷨��this.������(�����б�)
	public void f1() {
		System.out.println("f1()����");
	}
	public void f2() {
		System.out.println("f2()����");
		//���ñ����f1
		//��һ�ַ���
			f1();
		//�ڶ��ַ���
			this.f1();
	}
	public void f3() {
		String name = "aaa";
		//��ͳ����
		System.out.println(name); //�ͽ�ԭ��
		//1��this�����������ʱ��������
		System.out.println(this.name);
	}
}