import java.util.Scanner;
public class March13th05 {
	public static void main(String[] args) {
		//�������һֱ����Ǯ����һֱ������ֱ������Ǯ
		/*
		����Ϊ��
		1����ͣ���ʻ�Ǯ��
		2��ʹ��char answer ���ջش𣬶���һ��Scanner����
		3��while�ж������y�Ͳ���ѭ��
		*/
		Scanner myScanner = new Scanner(System.in);
		char answer = ' '; //��ʼ��
		do{
			System.out.println("��ү��Ǯ�����㣬y/n"); //ѭ�����
			answer = myScanner.next().charAt(0); //ѭ����������
			System.out.println("�����Ļش���" + answer);
		} while(answer != 'y');  //�ж������ܹؼ�
		System.out.println("�������㻹Ǯ��");
	}
}