public class March21th02 {
	public static void main(String[] args) {
		//��� 1-1/2+1/3-1/4...1/100 �ĺ�
        double sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum -= 1.0 / i;     //��ʱû�뵽����ֱ�� (1.0 / i)�����ұ�
			} else {			
				sum += 1.0 / i;
			}
		}
		System.out.println("sum=" + sum);
	}
}