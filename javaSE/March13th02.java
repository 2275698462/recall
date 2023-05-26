public class March13th02 {
	public static void main(String[] args) {
		//化繁为简，先死后活
		int i1 = 1;
		while(i1 <= 100) {
			if(i1 % 3 == 0) {
			System.out.println(i1);
			}
			i1++;	
		}
		int i2 = 40;
		while(i2 <= 200) {
			if (i2 % 2 == 0 ) {
			System.out.println("手动分割线" + i2);
			}
			i2++;
		}
	}
}