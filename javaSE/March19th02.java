public class March19th02 {
	public static void main(String[] args) {
		int sum = 0;
		int n = 666;
		for(int i = 1; i <= 100; i++){
			sum += i;
			if(sum >= 20){
				System.out.println("��ǰ��=" + i);
				n = i;
				break;
			}
		}
		System.out.println("��ǰ��=" + n);//��for�ⲿ�ȶ���һ��n
	}
}