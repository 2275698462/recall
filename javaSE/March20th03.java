import java.util.Scanner;
public class March20th03 {
	public static void main(String[] args) {
		Scanner myScanner =new Scanner(System.in);
		System.out.println("������һ������");
		int i = myScanner.nextInt(); 
		if( i > 0) {
			System.out.println("����0");
		} else if(i < 0) {
			System.out.println("С��0");
		} else {
			System.out.println("������");
		}
	}
}