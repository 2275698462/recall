public class March23th01 {
	public static void main(String[] args) {
		int[] a = {4, -1, 9, 10, 23};
		int sum = 0;
		int max = a[0];//�ٶ���һ��Ԫ�ؾ������ֵ
		int maxIndex = 0; //�ٶ���һ���±��Ӧ��ֵ�������ֵ
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
				maxIndex = i;
			}
		}
		System.out.println("max=" + max + "   maxIndex=" + maxIndex);
	}
}