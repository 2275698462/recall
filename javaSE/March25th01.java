import java.util.Scanner;
public class March25th01 {
	public static void main(String[] args) {
		/*
		  有一列数组，白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏，；
          从键盘中任意输入一个名称，判断数列是否包含此名称[顺序查找]
          要求：如果找到了，就提示找到，并给出下标
		*/
		Scanner myScanner = new Scanner(System.in);
		String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
		System.out.println("请输入四大法王之一的名字");
		String findname = myScanner.next();
		int index = -1;       //找不到的情况
		for(int i = 0; i < names.length; i++) {
			//字符串比较用equals
                    if(findname.equals(names[i])) {
						System.out.println("找到了，下标是" + i);
						index = i;
						break;
					} 
		}
		if(index == -1) { //没有找到的情况
		System.out.println(findname + "不是四大法王");
		}

	}
}