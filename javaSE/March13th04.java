public class March13th04 {
	public static void main(String[] args) {
		//��ӡ1-100���������ܺ�
		int i1 = 1;
		int sum = 0;
		do{
			System.out.println(i1);
			i1++;
			sum += i1;
		} while(i1 <= 100);
		System.out.println("sum=" + sum);
         System.out.println("============");
		//ͳ��1-200֮���ܱ�5���������ܱ�3�����ĸ���
		//�������
		int i2 = 1;
		int number = 0;
		do{
			if(i2 % 5 ==0 && i2 % 3 != 0) {
				number++;
			}
			i2++;
		} while(i2 <= 200);
		System.out.println("number=" + number );
	}
}