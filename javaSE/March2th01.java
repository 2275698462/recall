import java.util.Scanner;//��ʾ��java.util��de Scanner�ർ��
public class March2th01 {
	public static void main(String[] args) {
		//��ʾ�����û�������
		/*
		����
		    Scanner���ʾ���ı�ɨ��������java.util��
		1������/���� Scanner�����ڵİ�
		2������Scanner����new������һ���������
		     myScanner����Scanner��Ķ���
		*/
		Scanner myScanner = new Scanner(System.in);
		//3�������û����룬ʹ����صķ���
		System.out.println("����������");
		//������ִ�е�next����ʱ����ȴ��û�����
		String name = myScanner.next();//�����û������ַ���
		System.out.println("����������");
		int age = myScanner.nextInt();//�����û�����int
		System.out.println("������нˮ");
		double sal = myScanner.nextDouble();//�����û�����double
		System.out.println("�˵���Ϣ���£�");
		System.out.println("����=" + name + " ����=" + age + " нˮ=" + sal);
	}
}