public class March19th05 {
	public static void main(String[] args) {
		label1:
			for(int j = 0; j < 2; j++) {
			lable2:
				for(int i = 0; i < 10; i++) {
				if( i == 2) {
					continue label1;
				}
				System.out.println("i = " + i);
			}
		}
	}
}