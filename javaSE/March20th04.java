import java.util.Scanner;
public class March20th04 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个三位整数");
		int i =myScanner.nextInt();
		int n = i / 100; //百位数
		int m = (i - n * 100) / 10; //十位数
		int b = i - ( n * 100 + m * 10); //个位数
		if  ( i == n * n * n + m * m * m + b * b * b && i >= 100 && i <= 999 ) {
			System.out.println("这是水仙花数");
		} else if(i < 100 || i > 999) {
			System.out.println("输入的不是三位数");
		} else {
			System.out.println("这不是水仙花数");
		}
	}
}