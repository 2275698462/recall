public class March17th {
	public static void main(String[] args) {
		/*化繁为简
		1、先打印一个矩形
		2、打印半个金字塔
		     *
			 **
			 ***
			 ****
			 *****
	    3、打印整个金字塔
		        *                1个     2 * 1 - 1       4=(总层数-1)个空格
			  ***              3个     2 * 2 - 1       3=(总层数-2)个空格
			 *****           5个      2 * 3 - 1       2=(总层数-3)个空格
		   *******         7个      2 * 4 - 1       1=(总层数-4)个空格
		  *********       9个     2 * 5 - 1        0=(总层数-5)个空格
		  4、打印空心的金字塔[最难的]
		        *                1个     当前行的第一个位置和最后一个位置都是*
			  *  *              2个     当前行的第一个位置和最后一个位置都是*
			 *    *             2个      当前行的第一个位置和最后一个位置都是*
		   *        *           2个      当前行的第一个位置和最后一个位置都是*
		 *********        9个     全部输出
		 先死后活
		 5、把层数做成变量 int totalLevel = 5

         */
		 int totalLevel = 5;
        for(int i = 1; i <= totalLevel; i++) {   //i表示层数
			//在输出*之前还要输出空格 ，对应空格 = 总层数 - 当前层
			for (int k = 1; k <= totalLevel - i; k++){
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++) {  //2 * i - 1表示每层打的个数
			   if(j == 1 || j == 2 * i - 1 || i == totalLevel) {
				System.out.print("*");
			    } else {  //其他情况输出空格
				System.out.print(" ");
			  }
			}
			System.out.println("");//println本身会换行，相当于print("\n")
		}
	}
}