import java.util.Scanner;
public class March10th03 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
         System.out.println("�������·�");
		 int month = myScanner.nextInt();
		 if(month >=1 && month <= 12) {
			 switch(month / 3) { // �Լ����ģ�����ֱ��month�����ʽ���븴���ˣ�
				 case 1 :
					 System.out.println("��");
				 break;
				 case 2 :
                      System.out.println("��");
				 break;
				 case 3 :
                         System.out.println("��");
				 break;
				 case 0  :
				 case 4  :
				System.out.println("��");
				 break;
			 }
		 } else {
			 System.out.println("�����·�����");
		 }
	}
}