import java.util.Scanner;
public class March19th03 {
	public static void main(String[] args) {
        //实现登录验证，如果用户名为“丁真”，密码“666”，
		//提示登陆成功，否则提示还有几次机会
		/*
		    思路分析：
			1、创建Scanner对象接收用户输入
			2、定义String name;String password;保存用户名和密码
			3、最多循环3次[登录三次]，如果满足条件就提前退出
			4、定义变量int change 记录还有几次登录机会
		*/
		Scanner myScanner = new Scanner(System.in);
		String name = " ";
		String password = " ";
		int change = 3;
		for(int i = 1; i <= 3; i++){
			System.out.println("请输入用户名");
			name = myScanner.next();
			System.out.println("请输入密码");
			password = myScanner.next();
			//比较输入的用户名和密码是否正确
			//补充说明字符串的比较，使用的方法 equals
			if("丁真".equals(name) && "666".equals(password)) {
				System.out.println("登录成功");
					break;
			}
			change--;
			System.out.println("你还有" + change + "次机会");
		}
	}
}