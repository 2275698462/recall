public class February20th03 {
	public static void main(String[] args) {
		//�������ʹ�ã�ǰ++�ͺ�++���ȼ���i = i + 1
		int i = 10;
		i++;//�ȼ���i = i + 1;
		++i;//�ȼ���i = i + 1;
		System.out.println("i=" + i);//12
		int b = 66;
		System.out.println(++b + b); //b = b +1 ,b = 67

		/*���ʽʹ��
		ǰ++��++i��������ֵ
		��++��i++�ȸ�ֵ������
		*/
		int j = 8;
		//int k = ++j; //�ȼ���j = j + 1;k = j;
		int k = j++;//�ȼ���k = j; j = j+1;
		System.out.println("k=" + k + "j=" + j);

	}
}