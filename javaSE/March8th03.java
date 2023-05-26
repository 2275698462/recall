import java.util.Scanner;
public class March8th03 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int month =myScanner.nextInt();

		if(month >=4 && month<= 10) {
			System.out.println("旺季");
			System.out.println("请输入年龄");
          int age = myScanner.nextInt();
      
          
		  if(age >= 18 && age <=60) {
			  System.out.println("成人60");
		  } else if(age < 18) {
			  System.out.println("儿童30");
		  } else if(age > 60) {
			  System.out.println("老人20");
		  }
		} else if (month <4 || month >10) {
			System.out.println("淡季");
			System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		if(age >= 18 && age <= 60) {
              System.out.println("成人40");
		} else if(age <18 || age >60) {
        System.out.println("20");
		}
		}



	}
}