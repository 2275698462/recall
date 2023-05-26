public class April1th02 {
	public static void main(String[] args) {
		AA a = new AA();
		int[] res = a.getSumAndSub(1, 4);
		System.out.println("和=" + res[0]);
		System.out.println("差=" + res[1]);
	}
}
class AA {
	//1、一个方法最多有一个返回值。 [如何返回多个结果，返回数组]
	public int[] getSumAndSub(int n1, int n2) {
		int[] resArr = new int[2];
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}
	//2、如果方法要求有返回数据类型，则方法体中最后的执行语句必须为return值，
    //而且要求返回值类型必须和return的值类型一致或兼容
	public double f1() {
		return 1;
	}
	//3、如果方法是void，则方法体中可以没有return语句或者只写return
	public void f2() {
		System.out.println("hello1");
	}

}