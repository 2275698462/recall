public class March11th01 {
	public static void main(String[] args) {
		//初始化和变量迭代可以写到其他地方，但是两边的分号不能省略
		int i = 1;
		for( ; i <=10 ; ) {
			System.out.println("hello" + i);
			i++;
		}
		System.out.println(i);
          //补充
		  //int j = 1;
		  //for(;;) { //表示一个无限循环，死循环
		  //System.out.println("ok" + (j++));
		  // }
		  int count = 3;
		  //循环初始化可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开,
		  //循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开
		  for (int i2 = 0,j2 = 0; i2 < count; i2++, j2 += 2) {
			  System.out.println("i2=" + i2 + " j2=" + j2);
		  }
	}
}