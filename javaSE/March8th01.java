import java.util.Scanner;
public class March8th01 {
	public static void main(String[] args) {
		/*
		����xx��֥�����÷֣������
		���÷�Ϊ100��������ü���
		���÷�Ϊ(80,99]ʱ�������������
		���÷�Ϊ[60,80]ʱ���������һ��
		���������������ò�����
		�������룬�������ж�
		*/
		Scanner myScanner = new Scanner(System.in);
		//�����û�����
		System.out.println("���������÷�(1-100)��");
		int grade = myScanner.nextInt();
		//�ȶ��������÷ֽ����ж�1-100��������ʾ�������


       if (grade >= 1 && grade <= 100) {

		if(grade == 100) {
			System.out.println("���ü���");
		} else if (grade > 80 && grade <= 99) {
			System.out.println("��������");
		} else if (grade >=60 && grade <=80) {
			System.out.println("����һ��");
		} else {
			System.out.println("���ò�����");
		}
	   } else {
		   System.out.println("������������������");
	   }


	}
}