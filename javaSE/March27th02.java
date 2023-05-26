public class March27th02 {
	public static void main(String[] args) {
		/*
		扩容 + 定位
		1、先确定添加数应该插入到哪个索引
		2、然后扩容
		*/
		int[] arr = {10, 12, 45, 90};
		int insertNum = 23;
		int index = -1; //index就是要插入的位置
		/*
		1、遍历arr数组，如果发现insertNum<=arr[i],说明 i 就是要插入的位置
        2、使用index保留 ， index = i
		3、如果遍历完后，没有发现insertNum<=arr[i],说明index = arr.length
		即：添加到arr的最后
		*/
		for(int i = 0; i < arr.length; i++) {
			if(insertNum <= arr[i]) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			index = arr.length;
		}
		int[] arrNew = new int[arr.length + 1];
		//将arr的元素拷贝到arrNew,并且跳过index位置
		// i控制arrNew的下标，j用来控制arr数组下标
           for(int i = 0, j = 0; i < arrNew.length; i++) {
			   if( i != index) {
				   arrNew[i] = arr[j];
				   j++;
			   } else {
				   arrNew[i] = insertNum;
			   }
		   }
		   arr = arrNew;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}