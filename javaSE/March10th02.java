import java.util.Scanner;
public class March10th02 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ɼ�(1-100)");
		/*
		�Գɼ�����60�ģ�������ϸ񡱣�����60��������ϸ񡱣�����ĳɼ� ���ܴ���100
		˼·������
		1��������if-else����Ҫ����switch
		2����Ҫ����һ��ת�������˼·��
		           ����ɼ���[60,100]��(int)(�ɼ� / 60) = 1
				   ����ɼ���[0,60),(int)(�ɼ� / 60) = 0
		*/
		double score = myScanner.nextDouble();
		//ʹ��if-else��֤������Ч����
		if(score >= 0 && score <= 100) {
		switch ((int)(score / 60)) {
              case 0 :
				  System.out.println("���ϸ�");
			  break;
			  case 1 :
				  System.out.println("�ϸ�");
			  break;
		}
		} else {
			System.out.println("��������");
		}
	}
}