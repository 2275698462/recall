import java.util.Scanner;
public class March8th02 {
	public static void main(String[] args) {
		/*
		�μӸ��ֱ�������������ɼ�����8.0���������������ʾ��̭��
		�������Ա���ʾ�����������Ů���顣����ɼ����Ա𣬽����жϺ������Ϣ
		*/
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ֳɼ�");
		double score = myScanner.nextDouble();
		if(score > 8.0) {
			System.out.println("�������Ա�");
			char gender = myScanner.next().charAt(0);

             if(gender == '��') {
				 System.out.println("����������");
			 } else if(gender == 'Ů') {
				 System.out.println("����Ů����");
			 } else {
				 System.out.println("����Ա����󣬲��ܲμӱ���");
			    }
			 }  else {
			 System.out.println("�㱻��̭��");
		}
	}
}