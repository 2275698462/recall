import java.util.Scanner;
public class March10th03 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
         System.out.println("请输入月份");
		 int month = myScanner.nextInt();
		 if(month >=1 && month <= 12) {
			 switch(month / 3) { // 自己做的，可以直接month当表达式（想复杂了）
				 case 1 :
					 System.out.println("春");
				 break;
				 case 2 :
                      System.out.println("夏");
				 break;
				 case 3 :
                         System.out.println("秋");
				 break;
				 case 0  :
				 case 4  :
				System.out.println("冬");
				 break;
			 }
		 } else {
			 System.out.println("输入月份有误");
		 }
	}
}