public class March23th02 {
	public static void main(String[] args) {
		//基本数据类型赋值，赋值方式为值拷贝
		//n2的变化，不会影响到n1的值
		int n1 = 10;
		int n2 = n1;
		n2 = 80;
		System.out.println("n1=" + n1);
		System.out.println("n2=" + n2);
		//数组在默认情况下是引用传递，赋的值是地址,赋值方式为引用赋值/地址拷贝
		//是一个地址, arr2 变化会影响 arr1
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;//把 arr1 赋给 arr2
		arr2[0] = 10;
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}
}