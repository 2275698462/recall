import java.util.Scanner;
public class March25th01 {
	public static void main(String[] args) {
		/*
		  ��һ�����飬��üӥ������ëʨ����������������������������Ϸ����
          �Ӽ�������������һ�����ƣ��ж������Ƿ����������[˳�����]
          Ҫ������ҵ��ˣ�����ʾ�ҵ����������±�
		*/
		Scanner myScanner = new Scanner(System.in);
		String[] names = {"��üӥ��", "��ëʨ��", "��������", "��������"};
		System.out.println("�������Ĵ���֮һ������");
		String findname = myScanner.next();
		int index = -1;       //�Ҳ��������
		for(int i = 0; i < names.length; i++) {
			//�ַ����Ƚ���equals
                    if(findname.equals(names[i])) {
						System.out.println("�ҵ��ˣ��±���" + i);
						index = i;
						break;
					} 
		}
		if(index == -1) { //û���ҵ������
		System.out.println(findname + "�����Ĵ���");
		}

	}
}