public class March20th02 {
	public static void main(String[] args) {
		double money = 100000;
		int count = 0;
		while( money > 50000) {
			money *= 0.95;
			count++;
           while( money <= 50000 && money >= 1000) {
			   money -= 1000;
				   count++;
		   }
		}
		System.out.println("count=" + count);
		//上面自己做的
		double money1 = 100000;
		int count1 = 0;
		while(true) { //无限循环
		 if (money1 > 50000) {
			 money1 *= 0.95;
			 count1++;
		 } else if (money1 <= 50000 && money1 >= 1000) {
			 money1 -= 1000;
			 count1++;
		 } else {
			 break;
		 }
		}
		System.out.println("count1=" + count1);
	}
}