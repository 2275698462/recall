import java.util.Scanner;
public class March13th05 {
	public static void main(String[] args) {
		//如果张三一直不还钱，就一直打他，直到他还钱
		/*
		化繁为简
		1、不停的问还钱吗
		2、使用char answer 接收回答，定义一个Scanner对象
		3、while判断如果是y就不在循环
		*/
		Scanner myScanner = new Scanner(System.in);
		char answer = ' '; //初始化
		do{
			System.out.println("给爷还钱，打你，y/n"); //循环语句
			answer = myScanner.next().charAt(0); //循环变量迭代
			System.out.println("张三的回答是" + answer);
		} while(answer != 'y');  //判断条件很关键
		System.out.println("张三总算还钱了");
	}
}