public class March21th03 {
	public static void main(String[] args) {
		//��1+(1+2)+(1+2+3)+...+(1+2+3+..+100)�ĺ�
		/*
		˼·����
		1��һ����100�����
		2��ÿһ���������������
		3������һ��˫��ѭ��
		    ^^^^i ���Ա�ʾ�ڼ��ͬʱҲ�ǵ�ǰ������һ����
		*/
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			for(int j = 1; j <= i; j++) { //�ڲ��1-i����ѭ��
                  sum += j;
			}
		}
		System.out.println("sum=" + sum);

	}
}