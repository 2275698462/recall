public class March22th01 {
	public static void main(String[] args) {
		//求6只鸡的平均体重，分别是3  , 5    1  ， 3.4  ，2 ， 50
		double[] hens = {3, 5, 1, 3.4, 2, 50};
		double totalweight = 0;
		for(int i = 0; i < 6; i++) {
			System.out.println("第" + (i + 1) + "个元素的值"  + hens[i]);
			totalweight += hens[i];
		}
		System.out.println("数组长度=" + hens.length);
		System.out.println("总体重=" + totalweight 
			+ "平均体重" + (totalweight / 6));
		/*
		解读
		1、可以通过hens[下标]来访问数组的元素
		    下标是从0开始编号的，比如第一个元素就是hens[0],第二个元素是hens[1],依此类推
		2、通过for就可以循环的访问数组的元素 / 值
		3、可以通过 数组名.length得到数组的大小/长度
		*/
	}
}