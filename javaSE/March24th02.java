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
		System.out.println("���������ӵ�Ԫ��");
		int addNum = myScanner.nextInt();
			arrNew[arrNew.length - 1] = addNum;
			arr = arrNew;
		System.out.println("===========�������");
			for(int i = 0; i < arr.length; i++){
				System.out.println(arr[i]);
			}
			System.out.println("�Ƿ��������y/n");
			char key = myScanner.next().charAt(0);
			if(key == 'n') {
				break;
			}
		} while(true);
	}
}