public class March16th {
	public static void main(String[] args) {
               for(int j = 1; j <= 9; j++){
		for(int i = 1; i <= 9; i++) {
			if(j <= i) {
			System.out.print(j + "*" + i + "=" + (j * i));
			}
			System.out.println("");//不会一列列输出 ，hh
		}
			   }
	}
}