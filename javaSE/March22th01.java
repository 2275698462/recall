public class March22th01 {
	public static void main(String[] args) {
		//��6ֻ����ƽ�����أ��ֱ���3  , 5    1  �� 3.4  ��2 �� 50
		double[] hens = {3, 5, 1, 3.4, 2, 50};
		double totalweight = 0;
		for(int i = 0; i < 6; i++) {
			System.out.println("��" + (i + 1) + "��Ԫ�ص�ֵ"  + hens[i]);
			totalweight += hens[i];
		}
		System.out.println("���鳤��=" + hens.length);
		System.out.println("������=" + totalweight 
			+ "ƽ������" + (totalweight / 6));
		/*
		���
		1������ͨ��hens[�±�]�����������Ԫ��
		    �±��Ǵ�0��ʼ��ŵģ������һ��Ԫ�ؾ���hens[0],�ڶ���Ԫ����hens[1],��������
		2��ͨ��for�Ϳ���ѭ���ķ��������Ԫ�� / ֵ
		3������ͨ�� ������.length�õ�����Ĵ�С/����
		*/
	}
}