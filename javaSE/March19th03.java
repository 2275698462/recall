import java.util.Scanner;
public class March19th03 {
	public static void main(String[] args) {
        //ʵ�ֵ�¼��֤������û���Ϊ�����桱�����롰666����
		//��ʾ��½�ɹ���������ʾ���м��λ���
		/*
		    ˼·������
			1������Scanner��������û�����
			2������String name;String password;�����û���������
			3�����ѭ��3��[��¼����]�����������������ǰ�˳�
			4���������int change ��¼���м��ε�¼����
		*/
		Scanner myScanner = new Scanner(System.in);
		String name = " ";
		String password = " ";
		int change = 3;
		for(int i = 1; i <= 3; i++){
			System.out.println("�������û���");
			name = myScanner.next();
			System.out.println("����������");
			password = myScanner.next();
			//�Ƚ�������û����������Ƿ���ȷ
			//����˵���ַ����ıȽϣ�ʹ�õķ��� equals
			if("����".equals(name) && "666".equals(password)) {
				System.out.println("��¼�ɹ�");
					break;
			}
			change--;
			System.out.println("�㻹��" + change + "�λ���");
		}
	}
}