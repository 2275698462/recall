public class April1th04 {
	public static void main(String[] args) {
		AA a = new AA();
		if(a.f1(1)) {
			System.out.println("是奇数");
		} else {
			System.out.println("是偶数");
		}
		//使用print方法
		a.print(4, 4, '#');
	}
}
class AA {
	public boolean f1(int num) {
		/*
		if(n1 % 2 == 0) {
			return false;
		} else {
			return true;
		}
		return num % 2 != 0 ? turn; fales;
		*/
         return num % 2 != 0;
	}
	//2、根据行、列、字符打印对应行数和列数的字符，比如：
    //行：4，列：4，字符#，则打印对应的效果
	/*思路
	       1、方法的返回类型 void
		   2、方法的名字print
		   3、方法的形参(int row ,int col, char c)
		   4、方法体，循环
	*/
	public void print(int row ,int col, char c) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
			System.out.print(c);
		}
		System.out.println();
	}
}
}