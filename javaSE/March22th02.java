import java.util.Scanner;
public class March22th02 {
	public static void main(String[] args) {
		//ѭ������5���ɼ������浽double���飬�����
        Scanner myScanner = new Scanner(System.in);
		double[] scores = new double[5];
		//�ڶ��ֶ�̬���䷽ʽ�����������飬�� new ����ռ�
		//double scores[];
		//scores = new double[5];
		for(int i = 0; i < scores.length; i++) {
			System.out.println("�������" + (i + 1) + "���˵ĳɼ�");
			scores[i] = myScanner.nextDouble();
		}
		//�������������
		for(int i = 0; i < scores.length; i++) {
			System.out.println("��" + (i+1) + "��Ԫ�ص�ֵ=" + scores[i]);
		}
	}
}