public class March24th04 {
	public static void main(String[] args) {
		//冒泡排序代码实现
		int[] arr = {24, 69, 80, 57 ,13,};
		int temp = 0;//用于辅助交换的变量
		//先死后活-> 4 =  arr.length - 1
		for( int i = 0; i < arr.length - 1; i++) {        //外层循环四次，依次找最大的数，第二大的数
		for( int j = 0; j < arr.length - 1 - i; j++) {     //比较4,3,2,1次
		//如果前面的数 > 后面的数，就交换
		if(arr[j] > arr[j + 1]) {
           temp = arr[j];
		   arr[j] = arr[j + 1];
		   arr[j + 1] = temp;
		   } 
		}
		System.out.println("\n" + "第" + (i +1) + "轮");
		       for( int j = 0; j < arr.length; j++) {
			   System.out.print(arr[j] + "\t");
		   }
  }

	}
}