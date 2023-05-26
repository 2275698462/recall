public class March21th02 {
	public static void main(String[] args) {
		//求出 1-1/2+1/3-1/4...1/100 的和
        double sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum -= 1.0 / i;     //当时没想到可以直接 (1.0 / i)放在右边
			} else {			
				sum += 1.0 / i;
			}
		}
		System.out.println("sum=" + sum);
	}
}