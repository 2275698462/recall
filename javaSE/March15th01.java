import java.util.Scanner;
public class March15th01 {
	public static void main(String[] args) {
		/*
		化繁为简
		1、先计算一个班，5个学生的成绩和平均分
		2、定义一个double sum累计5个学生的成绩
		3、统计3个班平均分
		4、所有班级平均分，定义一个变量double totalScore累积所有学生的成绩
		5、当多重循环结束后，totalScore / (3 * 5)
		6、定义变量 int passNum = 0;当有一个学生成绩>=60,++
		*/
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;
		int passNum = 0;//及格人数
		for( int i = 1; i <= 3; i++) {
		double sum = 0;
		for( int j = 1; j <= 5; j++) {
			System.out.println("请输入第" + i +"个班的第" + j + "个同学成绩");
			double score = myScanner.nextDouble();//接收成绩，在这里使用if
			if(score >= 60) {
				passNum++;
			}
			sum += score;//累积
			System.out.println("第" + i +"个班的第" + j + "个同学成绩为" + score);
		}
            totalScore += sum;
		System.out.println("sum=" + sum + ",平均分=" + (sum / 5));
		}
		System.out.println("三班及格人数=" + passNum);
		System.out.println("三个班总分=" + totalScore + ",三个班平均分=" + (totalScore / 15) );
	}
}