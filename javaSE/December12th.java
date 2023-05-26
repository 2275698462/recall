public class December12th {
	public static void main(String[] args) {
		//1、有多种类型的数据混合运算时，
		//系统首先自动将所有数据转换成容量最大的那种数据类型，然后在进行运算
		int n1 = 10;
		//float d1 = n1 + 1.1; //错误 ，n1 + 1.1 结果类型是double
		//double d1 = n1 + 1.1;//正确， n1 + 1.1 结果类型是double
		float d1 = n1 + 1.1f; //正确，  n1 + 1.1 结果类型是float
 
         //2、只能把精度小的赋值给精度大的
		 //int n2 = 1.1; //错误 

        //3、（byte，short）和char之间不会相互自动转换
		byte b1 = 10;//对，-128~127
		//当把具体数据给byte时，先判断该数是否在byte范围内，如果是就可以
		//int n2 = 1;
		//byte b2 = n2;  //错误，原因：如果是变量赋值，判断类型

		//char c1 = b2;  错误：byte不能自动转成char


	}
}