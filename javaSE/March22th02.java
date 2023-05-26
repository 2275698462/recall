import java.util.Scanner;
public class March22th02 {
	public static void main(String[] args) {
		//循环输入5个成绩，保存到double数组，并输出
        Scanner myScanner = new Scanner(System.in);
		double[] scores = new double[5];
		//第二种动态分配方式，先声明数组，再 new 分配空间
		//double scores[];
		//scores = new double[5];
		for(int i = 0; i < scores.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个人的成绩");
			scores[i] = myScanner.nextDouble();
		}
		//输出，遍历数组
		for(int i = 0; i < scores.length; i++) {
			System.out.println("第" + (i+1) + "个元素的值=" + scores[i]);
		}
	}
}