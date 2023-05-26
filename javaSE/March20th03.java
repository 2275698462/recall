import java.util.Scanner;
public class March20th03 {
	public static void main(String[] args) {
		Scanner myScanner =new Scanner(System.in);
		System.out.println("请输入一个整数");
		int i = myScanner.nextInt(); 
		if( i > 0) {
			System.out.println("大于0");
		} else if(i < 0) {
			System.out.println("小于0");
		} else {
			System.out.println("等于零");
		}
	}
}