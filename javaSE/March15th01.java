import java.util.Scanner;
public class March15th01 {
	public static void main(String[] args) {
		/*
		����Ϊ��
		1���ȼ���һ���࣬5��ѧ���ĳɼ���ƽ����
		2������һ��double sum�ۼ�5��ѧ���ĳɼ�
		3��ͳ��3����ƽ����
		4�����а༶ƽ���֣�����һ������double totalScore�ۻ�����ѧ���ĳɼ�
		5��������ѭ��������totalScore / (3 * 5)
		6��������� int passNum = 0;����һ��ѧ���ɼ�>=60,++
		*/
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;
		int passNum = 0;//��������
		for( int i = 1; i <= 3; i++) {
		double sum = 0;
		for( int j = 1; j <= 5; j++) {
			System.out.println("�������" + i +"����ĵ�" + j + "��ͬѧ�ɼ�");
			double score = myScanner.nextDouble();//���ճɼ���������ʹ��if
			if(score >= 60) {
				passNum++;
			}
			sum += score;//�ۻ�
			System.out.println("��" + i +"����ĵ�" + j + "��ͬѧ�ɼ�Ϊ" + score);
		}
            totalScore += sum;
		System.out.println("sum=" + sum + ",ƽ����=" + (sum / 5));
		}
		System.out.println("���༰������=" + passNum);
		System.out.println("�������ܷ�=" + totalScore + ",������ƽ����=" + (totalScore / 15) );
	}
}