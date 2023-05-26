public class March26th01 {
	public static void main(String[] args) {
		int[][] arr = new int[3][]; //创建二维数组，但只是确定一维数组的个数
		for(int i = 0; i < arr.length; i++) { //遍历arr每个一维数组
		//给每个一维数组开空间 new
		//如果没有给一维数组new，那么arr[i]就是null
		arr[i] = new int[i + 1];
		//遍历一维数组，并给一维数组的每个元素赋值
		for( int j = 0; j < arr[i].length; j++) {
			arr[i][j] = i + 1;//赋值
		}
		}
		//遍历arr输出
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
}