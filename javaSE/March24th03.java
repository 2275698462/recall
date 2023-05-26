import java.util.Scanner;
public class March24th03 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 5};
		do {
		int[] arrNew = new int[arr.length - 1];
		for(int i = 0; i < arr.length - 1; i ++) {
			arrNew[i] = arr[i];
		}
		arr = arrNew;
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("是否继续缩减");
		char key = myScanner.next().charAt(0);
		if(key == 'n' ) {
			break;
		}
		if(arr.length == 1) {
			System.out.println("只剩一个，不能再缩减了");
			break;
		}
		} while(true);
			
	}
}