import java.util.Scanner;
public class March20th04 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int i =myScanner.nextInt();
		int n = i / 100; //��λ��
		int m = (i - n * 100) / 10; //ʮλ��
		int b = i - ( n * 100 + m * 10); //��λ��
		if  ( i == n * n * n + m * m * m + b * b * b && i >= 100 && i <= 999 ) {
			System.out.println("����ˮ�ɻ���");
		} else if(i < 100 || i > 999) {
			System.out.println("����Ĳ�����λ��");
		} else {
			System.out.println("�ⲻ��ˮ�ɻ���");
		}
	}
}