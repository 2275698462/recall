public class March19th02 {
	public static void main(String[] args) {
		int sum = 0;
		int n = 666;
		for(int i = 1; i <= 100; i++){
			sum += i;
			if(sum >= 20){
				System.out.println("当前数=" + i);
				n = i;
				break;
			}
		}
		System.out.println("当前数=" + n);//在for外部先定义一个n
	}
}