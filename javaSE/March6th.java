import java.util.Scanner;
public class March6th {
	public static void main(String[] args) {
	//输出一个程序，可以输入一个年龄，如果年龄大于18岁，
	//则输出"你年龄大于18，要为自己的行为负责"
	/*
	思路分析
	1、接收输入年龄，定义一个Scanner对象
	2、把年龄保存到一个变量int age
	3、使用if判断，输出对应内容
	*/
	Scanner myScanner = new Scanner(System.in);
	System.out.println("请输入年龄");
	int age = myScanner.nextInt();
	if(age > 18) {
         System.out.println("你年龄大于18，要为自己的行为负责");
	                   } else {
						   System.out.println("你的年龄不大这次放过你了");
					             }
	}
}
