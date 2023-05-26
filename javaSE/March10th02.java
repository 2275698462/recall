import java.util.Scanner;
public class March10th02 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入成绩(1-100)");
		/*
		对成绩大于60的，输出“合格”，低于60输出“不合格”，输出的成绩 不能大于100
		思路分析：
		1、可以用if-else，但要求用switch
		2、需要进行一个转换，编程思路：
		           如果成绩在[60,100]，(int)(成绩 / 60) = 1
				   如果成绩在[0,60),(int)(成绩 / 60) = 0
		*/
		double score = myScanner.nextDouble();
		//使用if-else保证输入有效数字
		if(score >= 0 && score <= 100) {
		switch ((int)(score / 60)) {
              case 0 :
				  System.out.println("不合格");
			  break;
			  case 1 :
				  System.out.println("合格");
			  break;
		}
		} else {
			System.out.println("输入有误");
		}
	}
}