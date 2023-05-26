import java.util.Scanner;
public class March24th02 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1, 2, 3};
		do {
		int[] arrNew = new int[arr.length + 1];
		for(int i = 0; i <arr.length; i++) {
			arrNew[i] = arr[i];
		}
		System.out.println("请输入添加的元素");
		int addNum = myScanner.nextInt();
			arrNew[arrNew.length - 1] = addNum;
			arr = arrNew;
		System.out.println("===========扩容情况");
			for(int i = 0; i < arr.length; i++){
				System.out.println(arr[i]);
			}
			System.out.println("是否继续添加y/n");
			char key = myScanner.next().charAt(0);
			if(key == 'n') {
				break;
			}
		} while(true);
	}
}