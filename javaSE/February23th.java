public class February23th {
	public static void main(String[] args) {
		int i = 1;
		i = i++; //规则使用临时变量（1）temp = i (2) i = i + 1(3)i = temp
		System.out.println(i);//1

		int i2 = 1;
		i2 = ++i;//(1)i = i + 1(2)temp = i(3)i = temp
		System.out.println(i2);//2

		//练习
		int a1 = 10;
		int a2 = 20;
		int a = a1++;      //（1）a = i1 (2)a1 = a1 + 1
		System.out.println("a=" + a);//10
		System.out.println("a2=" + a2);//20
		a = --a2;             //(1)a2 = a2 - 1(2)a = i2
		System.out.println("a=" + a);    //19
		System.out.println("a2=" + a2);  //19

	}
}