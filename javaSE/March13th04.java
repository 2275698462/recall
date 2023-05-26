public class March13th04 {
	public static void main(String[] args) {
		//打印1-100，并计算总和
		int i1 = 1;
		int sum = 0;
		do{
			System.out.println(i1);
			i1++;
			sum += i1;
		} while(i1 <= 100);
		System.out.println("sum=" + sum);
         System.out.println("============");
		//统计1-200之间能被5整除但不能被3整除的个数
		//先死后活
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