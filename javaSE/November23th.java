public class November23th{
  public static void main(String[] args){
	  double num1 = 2.7;
	  double num2 = 8.1 / 3;//2.7

	  System.out. println(num1);//2.7
	  System.out.println(num2);//接近2.7的一个小数。而不是2.7

                           if( num1 == num2){        //错误写法，不输出
							   System.out.println("相等");
						   }
//得到一个重要的使用点：对运算结果是小数的进行判断时，要小心。
//要以两个数的差值的绝对值在某个精度范围内进行判断。
                         if (Math.abs(num1 - num2) < 0.00001) {       //正确写法，可以输出
                              System.out.println("差值非常小，在我的精度范围内，认为相等");
                         }
						 System.out.println(Math.abs(num1 - num2));

						 //细节：如果是直接查询得到的小数或者直接赋值，可以直接判断相等
     }
}