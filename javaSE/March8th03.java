import java.util.Scanner;
public class March8th03 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������·�");
		int month =myScanner.nextInt();

		if(month >=4 && month<= 10) {
			System.out.println("����");
			System.out.println("����������");
          int age = myScanner.nextInt();
      
          
		  if(age >= 18 && age <=60) {
			  System.out.println("����60");
		  } else if(age < 18) {
			  System.out.println("��ͯ30");
		  } else if(age > 60) {
			  System.out.println("����20");
		  }
		} else if (month <4 || month >10) {
			System.out.println("����");
			System.out.println("����������");
		int age = myScanner.nextInt();
		if(age >= 18 && age <= 60) {
              System.out.println("����40");
		} else if(age <18 || age >60) {
        System.out.println("20");
		}
		}



	}
}