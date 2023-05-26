public class February20th03 {
	public static void main(String[] args) {
		//独立语句使用，前++和后++都等价于i = i + 1
		int i = 10;
		i++;//等价于i = i + 1;
		++i;//等价于i = i + 1;
		System.out.println("i=" + i);//12
		int b = 66;
		System.out.println(++b + b); //b = b +1 ,b = 67

		/*表达式使用
		前++；++i先自增后赋值
		后++；i++先赋值后自增
		*/
		int j = 8;
		//int k = ++j; //等价于j = j + 1;k = j;
		int k = j++;//等价于k = j; j = j+1;
		System.out.println("k=" + k + "j=" + j);

	}
}