public class November17th{
	public static void main(String[] args){
		//float num1 = 1.1;错误，右边比左边大
		float num2 = 1.1F;       //对的
		double num3 = 1.1;      //对的
         double num4 = 1.1f;     //对的,右边字节比左边小

		 double num5 =  .123;   //等价0.123

		 double num6 = 1.11111111111;   //对应第三点
             float num7 = 1.11111111111f;
			 System.out.println(num6);
			  System.out.println(num7);}
}
